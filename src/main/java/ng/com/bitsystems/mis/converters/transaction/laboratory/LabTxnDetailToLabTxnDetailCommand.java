package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.laboratory.LaboratoryInvestigationToLaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.converters.laboratory.PackageToPackageCommand;
import ng.com.bitsystems.mis.converters.laboratory.QueueToQueueCommand;
import ng.com.bitsystems.mis.converters.transaction.ServicePriceToServicePriceCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LabTxnDetailToLabTxnDetailCommand implements Converter<LaboratoryTransactionDetail, LaboratoryTransactionDetailCommand> {

    private ServicePriceToServicePriceCommand servicePriceToServicePriceCommand;
    private PackageToPackageCommand packageToPackageCommand;
    private LaboratoryInvestigationToLaboratoryInvestigationCommand laboratoryInvestigationToLaboratoryInvestigationCommand;
    private QueueToQueueCommand queueToQueueCommand;

    public LabTxnDetailToLabTxnDetailCommand(ServicePriceToServicePriceCommand servicePriceToServicePriceCommand,
                                             PackageToPackageCommand packageToPackageCommand,
                                             QueueToQueueCommand queueToQueueCommand,
                                             LaboratoryInvestigationToLaboratoryInvestigationCommand laboratoryInvestigationToLaboratoryInvestigationCommand) {
        this.servicePriceToServicePriceCommand = servicePriceToServicePriceCommand;
        this.packageToPackageCommand = packageToPackageCommand;
        this.laboratoryInvestigationToLaboratoryInvestigationCommand=laboratoryInvestigationToLaboratoryInvestigationCommand;
        this.queueToQueueCommand =queueToQueueCommand;
    }

    @Nullable
    @Override
    public LaboratoryTransactionDetailCommand convert(LaboratoryTransactionDetail source) {

        if (source==null)
            return null;

        LaboratoryTransactionDetailCommand command=new LaboratoryTransactionDetailCommand();
        command.setId(source.getId());
        command.setLaboratoryInvestigationCommand(laboratoryInvestigationToLaboratoryInvestigationCommand.convert(source.getInvestigations()));
        command.setPackageCommand(packageToPackageCommand.convert(source.getLabPackages()));

        if(source.getLaboratoryTransaction()!= null){
            command.setLaboratoryTransactionId(source.getLaboratoryTransaction().getId());
        }
        command.setServicePriceCommand(servicePriceToServicePriceCommand.convert(source.getServiceDetailPricing()));
        command.setQueueCommand(queueToQueueCommand.convert(source.getQueue()));

        return command;
    }
}
