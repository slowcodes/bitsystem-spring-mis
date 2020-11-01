package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationParameterCommand;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigationParameters;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class LabInvParameterCommandToLabInvParameter
implements Converter<LaboratoryInvestigationParameterCommand, LaboratoryInvestigationParameters> {

    private ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading;

    public LabInvParameterCommandToLabInvParameter(ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading) {
        this.experimentReadingCommandToExperimentReading = experimentReadingCommandToExperimentReading;
    }

    @Nullable
    @Override
    public LaboratoryInvestigationParameters convert(LaboratoryInvestigationParameterCommand source) {


        if(source==null){
            return null;
        }
        final LaboratoryInvestigationParameters laboratoryInvestigationParameters
                = new LaboratoryInvestigationParameters();

        laboratoryInvestigationParameters.setId(source.getId());
        laboratoryInvestigationParameters.setValue(source.getValue());
        laboratoryInvestigationParameters.setVariableName(source.getVariableName());
        laboratoryInvestigationParameters.setExperimentReadings(experimentReadingCommandToExperimentReading.convert(source.getExperimentReadingCommand()));

        return laboratoryInvestigationParameters;
    }
}
