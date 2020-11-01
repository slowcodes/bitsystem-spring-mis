package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ObservationQueueCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailCommandToLabTxnDetail;
import ng.com.bitsystems.mis.models.laboratories.ObservationQueue;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ObservationQueueCommandToObservationQueue implements
        Converter<ObservationQueueCommand, ObservationQueue> {

    private PackageCommandToPackage packageCommandToPackage;
    private LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail;

    public ObservationQueueCommandToObservationQueue(PackageCommandToPackage packageCommandToPackage,
                                                     LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail) {
        this.packageCommandToPackage = packageCommandToPackage;
        this.labTxnDetailCommandToLabTxnDetail = labTxnDetailCommandToLabTxnDetail;
    }

    @Nullable
    @Override
    public ObservationQueue convert(ObservationQueueCommand source) {

        if(source==null){
            return null;
        }

        final ObservationQueue observationQueue=new ObservationQueue();

        observationQueue.setId(source.getId());
        observationQueue.setScheduledTime(source.getScheduledTime());
        observationQueue.setPackages(packageCommandToPackage.convert(source.getPackageCommand()));
        observationQueue.setLaboratoryTransactionDetail(labTxnDetailCommandToLabTxnDetail.convert(source.getLaboratoryTransactionDetailCommand()));
        observationQueue.setStatus(source.getStatus());

        return observationQueue;
    }
}
