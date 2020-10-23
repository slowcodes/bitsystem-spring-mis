package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationParameterCommand;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigationParameters;
import org.springframework.core.convert.converter.Converter;

public class LabInvParameterToLabInvParameterCommand implements
        Converter<LaboratoryInvestigationParameterCommand, LaboratoryInvestigationParameters> {
    @Override
    public LaboratoryInvestigationParameters convert(LaboratoryInvestigationParameterCommand source) {
        return null;
    }
}
