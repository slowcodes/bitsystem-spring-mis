package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoriesCommand;
import ng.com.bitsystems.mis.models.laboratories.Laboratories;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LaboratoryCommandToLaboratory implements Converter<LaboratoriesCommand, Laboratories> {
    private InvestigationGroupCommandToInvestigationGroup investigationGroupCommandToInvestigationGroup;

    public LaboratoryCommandToLaboratory(InvestigationGroupCommandToInvestigationGroup investigationGroupCommandToInvestigationGroup) {
        this.investigationGroupCommandToInvestigationGroup = investigationGroupCommandToInvestigationGroup;
    }

    @Nullable
    @Override
    public Laboratories convert(LaboratoriesCommand source) {

        if(source==null){
            return null;
        }

        Laboratories laboratories = new Laboratories();
        laboratories.setId(source.getId());
        laboratories.setDescription(source.getDescription());
        laboratories.setLabName(source.getLabName());

//        if(source.getInvestigationGroupCommand().size()>0&&source.getInvestigationGroupCommand()!=null)
//            source.getInvestigationGroupCommand().forEach(investigationGroupCommand ->
//                    laboratories.getInvestigationGroups().add(investigationGroupCommandToInvestigationGroup.convert(investigationGroupCommand)));

        return laboratories;
    }
}
