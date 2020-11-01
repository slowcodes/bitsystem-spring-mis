package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ObservationQueueCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailToLabTxnDetailCommand;
import ng.com.bitsystems.mis.models.laboratories.ObservationQueue;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ObservationQueueToObservationQueueCommand implements Converter<ObservationQueue, ObservationQueueCommand> {

    private PackageToPackageCommand packageToPackageCommand;
    private LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand;

    public ObservationQueueToObservationQueueCommand(PackageToPackageCommand packageToPackageCommand,
                                                     LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand) {
        this.packageToPackageCommand = packageToPackageCommand;
        this.labTxnDetailToLabTxnDetailCommand = labTxnDetailToLabTxnDetailCommand;
    }

    @Nullable
    @Override
    public ObservationQueueCommand convert(ObservationQueue source) {

        if(source==null){
            return null;
        }

        final ObservationQueueCommand observationQueueCommand=new ObservationQueueCommand();
        observationQueueCommand.setId(source.getId());
        observationQueueCommand.setLaboratoryTransactionDetailCommand(labTxnDetailToLabTxnDetailCommand.convert(source.getLaboratoryTransactionDetail()));
        observationQueueCommand.setScheduledTime(source.getScheduledTime());
        observationQueueCommand.setPackageCommand(packageToPackageCommand.convert(source.getPackages()));
        observationQueueCommand.setStatus(source.getStatus());

        return observationQueueCommand;
    }
}
