package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationParameterCommand;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigationParameters;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LabInvParameterToLabInvParameterCommand implements
        Converter<LaboratoryInvestigationParameterCommand, LaboratoryInvestigationParameters> {

    private ExperimentReadingCommandToExperimentReading experimentReadingsToExperimentReadingCommand;

    public LabInvParameterToLabInvParameterCommand(ExperimentReadingCommandToExperimentReading experimentReadingsToExperimentReadingCommand) {
        this.experimentReadingsToExperimentReadingCommand = experimentReadingsToExperimentReadingCommand;
    }

    @Nullable
    @Override
    public LaboratoryInvestigationParameters convert(LaboratoryInvestigationParameterCommand source) {

        if(source==null)
            return null;

        final LaboratoryInvestigationParameters laboratoryInvestigationParameters=new LaboratoryInvestigationParameters();

        laboratoryInvestigationParameters.setId(source.getId());
        laboratoryInvestigationParameters.setVariableName(source.getVariableName());
        laboratoryInvestigationParameters.setValue(source.getValue());
        laboratoryInvestigationParameters.setExperimentReadings(experimentReadingsToExperimentReadingCommand.convert(source.getExperimentReadingCommand()));

        return laboratoryInvestigationParameters;
    }
}
