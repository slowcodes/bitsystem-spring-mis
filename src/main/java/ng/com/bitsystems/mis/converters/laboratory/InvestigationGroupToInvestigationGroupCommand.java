package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.InvestigationGroupCommand;
import ng.com.bitsystems.mis.models.laboratories.InvestigationGroups;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class InvestigationGroupToInvestigationGroupCommand implements Converter<InvestigationGroups, InvestigationGroupCommand> {

    private LaboratoryInvestigationToLaboratoryInvestigationCommand laboratoryInvestigationToLaboratoryInvestigationCommand;
    private LaboratoryToLaboratoryCommand laboratoryToLaboratoryCommand;

    public InvestigationGroupToInvestigationGroupCommand(LaboratoryInvestigationToLaboratoryInvestigationCommand laboratoryInvestigationToLaboratoryInvestigationCommand,
                                                         LaboratoryToLaboratoryCommand laboratoryToLaboratoryCommand) {
        this.laboratoryInvestigationToLaboratoryInvestigationCommand = laboratoryInvestigationToLaboratoryInvestigationCommand;
        this.laboratoryToLaboratoryCommand = laboratoryToLaboratoryCommand;
    }

    @Nullable
    @Override
    public InvestigationGroupCommand convert(InvestigationGroups source) {
        if(source==null)
            return null;

        final InvestigationGroupCommand investigationGroupCommand=new InvestigationGroupCommand();
        investigationGroupCommand.setId(source.getId());
        investigationGroupCommand.setGrpName(source.getGrpName());
        investigationGroupCommand.setLaboratory(laboratoryToLaboratoryCommand.convert(source.getLaboratories()));

        if(source.getLaboratoryInvestigations().size()>0 && source.getLaboratoryInvestigations()!=null)
            source.getLaboratoryInvestigations().forEach(laboratoryInvestigations ->
                    investigationGroupCommand.getLaboratoryInvestigationCommands().add(laboratoryInvestigationToLaboratoryInvestigationCommand.convert(laboratoryInvestigations)));

        return investigationGroupCommand;
    }
}
