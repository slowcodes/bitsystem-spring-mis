package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoriesCommand;
import ng.com.bitsystems.mis.models.laboratories.Laboratories;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LaboratoryToLaboratoryCommand implements Converter<Laboratories, LaboratoriesCommand> {
    private InvestigationGroupToInvestigationGroupCommand investigationGroupToInvestigationGroupCommand;

    public LaboratoryToLaboratoryCommand(InvestigationGroupToInvestigationGroupCommand investigationGroupToInvestigationGroupCommand) {
        this.investigationGroupToInvestigationGroupCommand = investigationGroupToInvestigationGroupCommand;
    }

    @Nullable
    @Override
    public LaboratoriesCommand convert(Laboratories source) {

        if(source==null)
            return null;

        LaboratoriesCommand laboratoriesCommand=new LaboratoriesCommand();
        laboratoriesCommand.setId(source.getId());
        laboratoriesCommand.setDescription(source.getDescription());

//        if(source.getInvestigationGroups().size()>0 && source.getInvestigationGroups()!=null)
//            source.getInvestigationGroups().forEach(investigationGroups ->
//                    laboratoriesCommand.getInvestigationGroupCommand().add(
//                            investigationGroupToInvestigationGroupCommand.convert(
//                                    investigationGroups
//                            )
//                    ));

        return laboratoriesCommand;
    }

}
