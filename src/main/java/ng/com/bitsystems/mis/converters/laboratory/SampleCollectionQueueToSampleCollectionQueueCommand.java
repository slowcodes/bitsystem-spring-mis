package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.SampleCollectionQueueCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailToLabTxnDetailCommand;
import ng.com.bitsystems.mis.models.laboratories.SampleCollectionQueue;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class SampleCollectionQueueToSampleCollectionQueueCommand implements
        Converter<SampleCollectionQueue, SampleCollectionQueueCommand> {

    private LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand;
    private PackageToPackageCommand packageToPackageCommand;

    public SampleCollectionQueueToSampleCollectionQueueCommand(LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand,
                                                               PackageToPackageCommand packageToPackageCommand) {
        this.labTxnDetailToLabTxnDetailCommand = labTxnDetailToLabTxnDetailCommand;
        this.packageToPackageCommand = packageToPackageCommand;
    }

    @Nullable
    @Override
    public SampleCollectionQueueCommand convert(SampleCollectionQueue source) {

        if(source==null){
            return null;
        }

        final SampleCollectionQueueCommand sampleCollectionQueueCommand = new SampleCollectionQueueCommand();

        sampleCollectionQueueCommand.setId(source.getId());
        sampleCollectionQueueCommand.setCollectionStatus(source.getCollectionStatus());
        sampleCollectionQueueCommand.setLaboratoryTransactionDetailCommand(labTxnDetailToLabTxnDetailCommand.convert(source.getLaboratoryTransactionDetail()));
        sampleCollectionQueueCommand.setPackageCommand(packageToPackageCommand.convert(source.getPackages()));
        sampleCollectionQueueCommand.setRequestTime(source.getRequestTime());

        return sampleCollectionQueueCommand;
    }
}
