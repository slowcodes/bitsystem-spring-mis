package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.converters.laboratory.ExperimentReadingsToExperimentReadingCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class LabTxnDetailToLabTxnDetailCommand implements Converter<LaboratoryTransactionDetail, LaboratoryTransactionDetailCommand> {
    private ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand;
    private ExperimentReadingsToExperimentReadingCommand experimentReadingsToExperimentReadingCommand;

    public LabTxnDetailToLabTxnDetailCommand(ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand, ExperimentReadingsToExperimentReadingCommand experimentReadingsToExperimentReadingCommand) {
        this.servicePriceCodeToServicePriceCodeCommand = servicePriceCodeToServicePriceCodeCommand;
        this.experimentReadingsToExperimentReadingCommand = experimentReadingsToExperimentReadingCommand;
    }

    @Nullable
    @Override
    public LaboratoryTransactionDetailCommand convert(LaboratoryTransactionDetail source) {
        if (source==null)
            return null;

        LaboratoryTransactionDetailCommand command=new LaboratoryTransactionDetailCommand();
        command.setId(source.getId());

        if(source.getExperimentResultsByParameters().size()>0 && source.getExperimentResultsByParameters()!=null)
            source.getExperimentResultsByParameters().forEach(experimentReadingCommand ->
                    command.getExperimentReadingCommands().add(
                            experimentReadingsToExperimentReadingCommand.convert(
                                    experimentReadingCommand
                            )
                    ));

        if (source.getLaboratoryInvestigations()!=null){
            command.setLaboratoryInvestigationId(source.getLaboratoryInvestigations().getId());
        }

        if(source.getPackages()!=null){
            command.setPackageId(source.getPackages().getId());
        }

        if(source.getLaboratoryTransaction()!= null){
            command.setLaboratoryInvestigationId(source.getLaboratoryTransaction().getId());
        }

        command.setComment(source.getComment());
        //command.setFrequency(source.getReversal());
        command.setReversal(source.getReversal());
        command.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getServicePriceCode()));
        command.setTimeOfTransaction(source.getTimeOfTransaction());
        command.setUseDiscountPrice(source.getUseDiscountPrice());
        command.setUserDiscount(source.getUserDiscount());

        return command;
    }
}
