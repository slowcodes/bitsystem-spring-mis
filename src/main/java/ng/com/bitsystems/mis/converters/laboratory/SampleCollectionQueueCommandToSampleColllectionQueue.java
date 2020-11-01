package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.SampleCollectionQueueCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailCommandToLabTxnDetail;
import ng.com.bitsystems.mis.models.laboratories.SampleCollectionQueue;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class SampleCollectionQueueCommandToSampleColllectionQueue
implements Converter<SampleCollectionQueueCommand, SampleCollectionQueue> {

    private LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail;
    private PackageCommandToPackage packageCommandToPackage;

    public SampleCollectionQueueCommandToSampleColllectionQueue(LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail,
                                                                PackageCommandToPackage packageCommandToPackage) {
        this.labTxnDetailCommandToLabTxnDetail = labTxnDetailCommandToLabTxnDetail;
        this.packageCommandToPackage = packageCommandToPackage;
    }

    @Nullable
    @Override
    public SampleCollectionQueue convert(SampleCollectionQueueCommand source) {
        if(source==null)
            return null;

        final SampleCollectionQueue sampleCollectionQueue=new SampleCollectionQueue();

        sampleCollectionQueue.setCollectionStatus(source.getCollectionStatus());
        sampleCollectionQueue.setId(source.getId());
        sampleCollectionQueue.setRequestTime(source.getRequestTime());
        sampleCollectionQueue.setLaboratoryTransactionDetail(labTxnDetailCommandToLabTxnDetail.convert(source.getLaboratoryTransactionDetailCommand()));

        sampleCollectionQueue.setPackages(packageCommandToPackage.convert(source.getPackageCommand()));

        return sampleCollectionQueue;
    }
}
