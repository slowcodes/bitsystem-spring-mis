package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.InvestigationGroupCommand;
import ng.com.bitsystems.mis.models.laboratories.InvestigationGroups;
import org.springframework.core.convert.converter.Converter;

public class InvestigationGroupCommandToInvestigationGroup implements Converter<InvestigationGroupCommand, InvestigationGroups> {
    @Override
    public InvestigationGroups convert(InvestigationGroupCommand source) {
        return null;
    }
}
