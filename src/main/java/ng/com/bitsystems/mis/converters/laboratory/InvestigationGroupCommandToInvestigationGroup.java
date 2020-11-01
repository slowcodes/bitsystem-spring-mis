package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.InvestigationGroupCommand;
import ng.com.bitsystems.mis.models.laboratories.InvestigationGroups;
import org.springframework.core.convert.converter.Converter;

public class InvestigationGroupCommandToInvestigationGroup implements Converter<InvestigationGroupCommand, InvestigationGroups> {
    private LaboratoryCommandToLaboratory laboratoryCommandToLaboratory;
    private LaboratoryInvestigationCommandToLaboratoryInvestigation laboratoryInvestigationCommandToLaboratoryInvestigation;

    public InvestigationGroupCommandToInvestigationGroup(LaboratoryCommandToLaboratory laboratoryCommandToLaboratory,
                                                         LaboratoryInvestigationCommandToLaboratoryInvestigation laboratoryInvestigationCommandToLaboratoryInvestigation) {
        this.laboratoryCommandToLaboratory = laboratoryCommandToLaboratory;
        this.laboratoryInvestigationCommandToLaboratoryInvestigation = laboratoryInvestigationCommandToLaboratoryInvestigation;
    }

    @Override
    public InvestigationGroups convert(InvestigationGroupCommand source) {
        if(source==null)
            return null;

        final InvestigationGroups investigationGroups= new InvestigationGroups();

        investigationGroups.setId(source.getId());
        investigationGroups.setLaboratories(laboratoryCommandToLaboratory.convert(source.getLaboratory()));
        investigationGroups.setGrpName(source.getGrpName());

        if(source.getLaboratoryInvestigationCommands()!=null && source.getLaboratoryInvestigationCommands().size()>0)
            source.getLaboratoryInvestigationCommands().forEach(laboratoryInvestigationCommand ->
                    investigationGroups.getLaboratoryInvestigations().add(laboratoryInvestigationCommandToLaboratoryInvestigation.convert(laboratoryInvestigationCommand)));


        return investigationGroups;
    }

}
