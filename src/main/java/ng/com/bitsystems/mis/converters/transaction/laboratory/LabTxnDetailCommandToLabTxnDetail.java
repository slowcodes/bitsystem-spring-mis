package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.laboratory.LaboratoryInvestigationCommandToLaboratoryInvestigation;
import ng.com.bitsystems.mis.converters.laboratory.PackageCommandToPackage;
import ng.com.bitsystems.mis.converters.laboratory.QueueCommandToQueue;
import ng.com.bitsystems.mis.converters.transaction.ServicePriceCommandToServicePrice;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LabTxnDetailCommandToLabTxnDetail implements Converter<LaboratoryTransactionDetailCommand, LaboratoryTransactionDetail> {

    private ServicePriceCommandToServicePrice servicePriceCommandToServicePrice;
    private LaboratoryInvestigationCommandToLaboratoryInvestigation laboratoryInvestigationCommandToLaboratoryInvestigation;
    private PackageCommandToPackage packageCommandToPackage;
    private QueueCommandToQueue queueCommandToQueue;

    public LabTxnDetailCommandToLabTxnDetail(ServicePriceCommandToServicePrice servicePriceCommandToServicePrice,
                                             PackageCommandToPackage packageCommandToPackage,
                                             QueueCommandToQueue queueCommandToQueue,
                                             LaboratoryInvestigationCommandToLaboratoryInvestigation laboratoryInvestigationCommandToLaboratoryInvestigation) {
        this.servicePriceCommandToServicePrice = servicePriceCommandToServicePrice;
        this.packageCommandToPackage = packageCommandToPackage;
        this.queueCommandToQueue = queueCommandToQueue;
        this.laboratoryInvestigationCommandToLaboratoryInvestigation = laboratoryInvestigationCommandToLaboratoryInvestigation;
    }

    @Nullable
    @Override
    public LaboratoryTransactionDetail convert(LaboratoryTransactionDetailCommand source) {
        if (source==null)
            return null;

        LaboratoryTransactionDetail transaction=new LaboratoryTransactionDetail();
        transaction.setId(source.getId());
        transaction.setInvestigations(laboratoryInvestigationCommandToLaboratoryInvestigation.convert(source.getLaboratoryInvestigationCommand()));
        transaction.setQueue(queueCommandToQueue.convert(source.getQueueCommand()));
        transaction.setServiceDetailPricing(servicePriceCommandToServicePrice.convert(source.getServicePriceCommand()));
        transaction.setLabPackages(packageCommandToPackage.convert(source.getPackageCommand()));

        if(source.getLaboratoryTransactionId()!= null){
            LaboratoryTransaction laboratoryTransaction=new LaboratoryTransaction();
            laboratoryTransaction.setId(source.getLaboratoryTransactionId());
            transaction.setLaboratoryTransaction(laboratoryTransaction);
            LaboratoryTransaction labTxn = laboratoryTransaction.addLabTnxDetail(transaction);
        }
        return transaction;
    }
}
