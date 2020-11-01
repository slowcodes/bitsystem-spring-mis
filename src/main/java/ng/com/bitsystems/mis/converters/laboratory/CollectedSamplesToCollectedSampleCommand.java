package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.CollectedSamplesCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailToLabTxnDetailCommand;
import ng.com.bitsystems.mis.models.laboratories.CollectedSamples;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class CollectedSamplesToCollectedSampleCommand implements
        Converter<CollectedSamples, CollectedSamplesCommand> {

    private LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand;
    private ExperimentReadingsToExperimentReadingCommand experimentReadingsToExperimentReadingCommand;

    public CollectedSamplesToCollectedSampleCommand(LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand,
                                                    ExperimentReadingsToExperimentReadingCommand experimentReadingsToExperimentReadingCommand) {
        this.labTxnDetailToLabTxnDetailCommand = labTxnDetailToLabTxnDetailCommand;
        this.experimentReadingsToExperimentReadingCommand = experimentReadingsToExperimentReadingCommand;
    }

    @Nullable
    @Override
    public CollectedSamplesCommand convert(CollectedSamples source) {

        if(source==null)
            return null;

        final CollectedSamplesCommand collectedSamplesCommand=new CollectedSamplesCommand();
        collectedSamplesCommand.setAnalysed(source.getAnalysed());
        collectedSamplesCommand.setId(source.getId());
        collectedSamplesCommand.setDateOfCollection(source.getDateOfCollection());
        collectedSamplesCommand.setSampleType(source.getSampleType());

        if(source.getExperimentResultsByParams()!=null && source.getExperimentResultsByParams().size()>0){
            source.getExperimentResultsByParams().forEach(experimentReadings -> collectedSamplesCommand.getExperimentReadingCommands().add(experimentReadingsToExperimentReadingCommand.convert(experimentReadings)));
        }

        return collectedSamplesCommand;
    }
}
