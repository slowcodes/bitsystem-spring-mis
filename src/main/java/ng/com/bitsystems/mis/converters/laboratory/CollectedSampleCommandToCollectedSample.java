package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.CollectedSamplesCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailCommandToLabTxnDetail;
import ng.com.bitsystems.mis.models.laboratories.CollectedSamples;
import ng.com.bitsystems.mis.models.users.Scientists;
import org.springframework.core.convert.converter.Converter;

public class CollectedSampleCommandToCollectedSample implements Converter<CollectedSamplesCommand, CollectedSamples> {

    private LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail;
    private ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading;

    public CollectedSampleCommandToCollectedSample(LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail,
                                                   ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading) {
        this.labTxnDetailCommandToLabTxnDetail = labTxnDetailCommandToLabTxnDetail;
        this.experimentReadingCommandToExperimentReading = experimentReadingCommandToExperimentReading;
    }

    @Override
    public CollectedSamples convert(CollectedSamplesCommand source) {
        if(source ==null)
            return null;

        final CollectedSamples collectedSamples = new CollectedSamples();
        collectedSamples.setId(source.getId());

        if(source.getUserId()!=null){
            Scientists scientists = new Scientists();
            scientists.setId(source.getUserId());
            collectedSamples.setUsers(scientists);
            Scientists scientist = scientists.addCollectedSample(collectedSamples);
        }

        collectedSamples.setAnalysed(source.getAnalysed());
        collectedSamples.setDateOfCollection(source.getDateOfCollection());
        collectedSamples.setSampleType(source.getSampleType());
        collectedSamples.setLaboratoryTransactionDetail(labTxnDetailCommandToLabTxnDetail.convert(source.getLaboratoryTransactionDetailCommand()));

        if(source.getExperimentReadingCommands().size()>0 && source.getExperimentReadingCommands()!=null)
            source.getExperimentReadingCommands().forEach(experimentReadingCommand -> collectedSamples.getExperimentResultsByParams().add(experimentReadingCommandToExperimentReading.convert(experimentReadingCommand)));

        return collectedSamples;
    }
}
