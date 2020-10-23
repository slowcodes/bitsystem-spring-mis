package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import org.springframework.core.convert.converter.Converter;

public class LaboratoryInvestigationCommandToLaboratoryInvestigation implements
        Converter<LaboratoryInvestigationCommand, LaboratoryInvestigations> {
    @Override
    public LaboratoryInvestigations convert(LaboratoryInvestigationCommand source) {
        return null;
    }
}
