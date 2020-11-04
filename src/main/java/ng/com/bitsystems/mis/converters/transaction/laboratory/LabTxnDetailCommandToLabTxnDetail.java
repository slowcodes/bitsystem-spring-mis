package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.converters.laboratory.ExperimentReadingCommandToExperimentReading;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import ng.com.bitsystems.mis.models.laboratories.Packages;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class LabTxnDetailCommandToLabTxnDetail implements Converter<LaboratoryTransactionDetailCommand, LaboratoryTransactionDetail> {
    private ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode;
    private ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading;

    public LabTxnDetailCommandToLabTxnDetail(ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode, ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading) {
        this.servicePriceCodeCommandToServicePriceCode = servicePriceCodeCommandToServicePriceCode;
        this.experimentReadingCommandToExperimentReading = experimentReadingCommandToExperimentReading;
    }

    @Nullable
    @Override
    public LaboratoryTransactionDetail convert(LaboratoryTransactionDetailCommand source) {
        if (source==null)
            return null;

        LaboratoryTransactionDetail transaction=new LaboratoryTransactionDetail();
        transaction.setId(source.getId());

        if(source.getExperimentReadingCommands().size()>0 && source.getExperimentReadingCommands()!=null)
            source.getExperimentReadingCommands().forEach(experimentReadingCommand ->
                    transaction.getExperimentResultsByParameters().add(
                            experimentReadingCommandToExperimentReading.convert(
                                    experimentReadingCommand
                            )
                    ));

        if (source.getLaboratoryInvestigationId()!=null){
            LaboratoryInvestigations investigations = new LaboratoryInvestigations();
            investigations.setId(source.getLaboratoryInvestigationId());
            transaction.setLaboratoryInvestigations(investigations);
            LaboratoryInvestigations investigation = investigations.addTransactions(transaction);
        }

        if(source.getPackageId()!=null){
            Packages packages = new Packages();
            packages.setId(source.getPackageId());
            transaction.setPackages(packages);
            Packages packaging = packages.addLanTxnDetail(transaction);
        }

        if(source.getLaboratoryTransactionId()!= null){
            LaboratoryTransaction laboratoryTransaction=new LaboratoryTransaction();
            laboratoryTransaction.setId(source.getLaboratoryTransactionId());
            transaction.setLaboratoryTransaction(laboratoryTransaction);
            LaboratoryTransaction labTxn = laboratoryTransaction.addLabTnxDetail(transaction);
        }

        transaction.setComment(source.getComment());
        transaction.setFrequency(source.getReversal());
        transaction.setReversal(source.getReversal());
        transaction.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
        transaction.setTimeOfTransaction(source.getTimeOfTransaction());
        transaction.setUseDiscountPrice(source.getUseDiscountPrice());
        transaction.setUserDiscount(source.getUserDiscount());

        return transaction;
    }
}
