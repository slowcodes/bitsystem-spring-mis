package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.InvestigationGroupCommand;
import ng.com.bitsystems.mis.models.laboratories.InvestigationGroups;
import org.springframework.core.convert.converter.Converter;

public class InvestigationGroupToInvestigationGroupCommand implements Converter<InvestigationGroups, InvestigationGroupCommand> {
    @Override
    public InvestigationGroupCommand convert(InvestigationGroups source) {
        return null;
    }
}
