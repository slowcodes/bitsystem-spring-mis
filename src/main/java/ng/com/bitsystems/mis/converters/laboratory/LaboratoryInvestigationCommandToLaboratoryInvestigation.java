package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.models.laboratories.InvestigationGroups;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class LaboratoryInvestigationCommandToLaboratoryInvestigation implements
        Converter<LaboratoryInvestigationCommand, LaboratoryInvestigations> {

    private ExperimentParameterCommandToExperimentParameter experimentParameterCommandToExperimentParameter;
    private PackageCommandToPackage packageCommandToPackage;
    private ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode;

    public LaboratoryInvestigationCommandToLaboratoryInvestigation(ExperimentParameterCommandToExperimentParameter experimentParameterCommandToExperimentParameter,
                                                                   PackageCommandToPackage packageCommandToPackage,
                                                                   ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode) {
        this.experimentParameterCommandToExperimentParameter = experimentParameterCommandToExperimentParameter;
        this.packageCommandToPackage = packageCommandToPackage;
        this.servicePriceCodeCommandToServicePriceCode = servicePriceCodeCommandToServicePriceCode;
    }

    @Nullable
    @Override
    public LaboratoryInvestigations convert(LaboratoryInvestigationCommand source) {

        if(source==null){
            return null;
        }

        final LaboratoryInvestigations laboratoryInvestigations=new LaboratoryInvestigations();

        laboratoryInvestigations.setId(source.getId());
        laboratoryInvestigations.setInv_desc(source.getDesc());
        laboratoryInvestigations.setEstimatedTurnaround(source.getEstimatedTurnaround());

        if(source.getExperimentParametersCommands().size()>0&&source.getExperimentParametersCommands()!=null)
            source.getExperimentParametersCommands().forEach(experimentParametersCommand ->
                    laboratoryInvestigations.getExperimentResultParameters().add(
                            experimentParameterCommandToExperimentParameter.convert(experimentParametersCommand)
                    ));

        if(source.getInvestigationGroupId()==null){
            InvestigationGroups investigationGroups = new InvestigationGroups();
            investigationGroups.setId(source.getInvestigationGroupId());
            laboratoryInvestigations.setInvestigationGroups(investigationGroups);
            InvestigationGroups groups = investigationGroups.addlabInvestigation(laboratoryInvestigations);
        }

        laboratoryInvestigations.setInvestigationType(source.getInvestigationType());

        if(source.getPackageCommand().size()>0 && source.getPackageCommand()!=null)
            source.getPackageCommand().forEach(packageCommand ->
                    laboratoryInvestigations.getPackages().add(packageCommandToPackage.convert(packageCommand)));

        laboratoryInvestigations.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
        laboratoryInvestigations.setTitle(source.getTitle());

        return laboratoryInvestigations;
    }

}
