package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.models.laboratories.Investigations;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LaboratoryInvestigationCommandToLaboratoryInvestigation implements
        Converter<LaboratoryInvestigationCommand, Investigations> {

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
    public Investigations convert(LaboratoryInvestigationCommand source) {

        if(source==null){
            return null;
        }

        final Investigations investigations =new Investigations();

        investigations.setId(source.getId());
        investigations.setInv_desc(source.getDesc());
        investigations.setEstimatedTurnaround(source.getEstimatedTurnaround());

        if(source.getExperimentParametersCommands().size()>0&&source.getExperimentParametersCommands()!=null)
            source.getExperimentParametersCommands().forEach(experimentParametersCommand ->
                    investigations.getExperimentResultParameters().add(
                            experimentParameterCommandToExperimentParameter.convert(experimentParametersCommand)
                    ));

//        if(source.getInvestigationGroupId()==null){
//            InvestigationGroups investigationGroups = new InvestigationGroups();
//            investigationGroups.setId(source.getInvestigationGroupId());
//            investigations.setInvestigationGroups(investigationGroups);
//            InvestigationGroups groups = investigationGroups.addlabInvestigation(investigations);
//        }

        investigations.setInvestigationType(source.getInvestigationType());

//        if(source.getPackageCommand().size()>0 && source.getPackageCommand()!=null)
//            source.getPackageCommand().forEach(packageCommand ->
//                    investigations.getLabPackages().add(packageCommandToPackage.convert(packageCommand)));

        investigations.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
        investigations.setTitle(source.getTitle());

        return investigations;
    }

}
