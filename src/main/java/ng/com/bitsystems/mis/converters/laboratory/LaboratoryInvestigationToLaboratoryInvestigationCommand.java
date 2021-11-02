package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.laboratories.Investigations;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LaboratoryInvestigationToLaboratoryInvestigationCommand implements Converter<Investigations, LaboratoryInvestigationCommand> {

    private ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand;
    private PackageToPackageCommand packageToPackageCommand;
    private ExperimentParameterToExperimentParameterCommand experimentParameterToExperimentParameterCommand;

    public LaboratoryInvestigationToLaboratoryInvestigationCommand(ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand,
                                                                   PackageToPackageCommand packageToPackageCommand,
                                                                   ExperimentParameterToExperimentParameterCommand experimentParameterToExperimentParameterCommand) {
        this.servicePriceCodeToServicePriceCodeCommand = servicePriceCodeToServicePriceCodeCommand;
        this.packageToPackageCommand = packageToPackageCommand;
        this.experimentParameterToExperimentParameterCommand = experimentParameterToExperimentParameterCommand;
    }

    @Nullable
    @Override
    public LaboratoryInvestigationCommand convert(Investigations source) {

        if(source==null){
            return null;
        }
        LaboratoryInvestigationCommand laboratoryInvestigationCommand = new
                LaboratoryInvestigationCommand();

        laboratoryInvestigationCommand.setId(source.getId());
        laboratoryInvestigationCommand.setDesc(source.getInv_desc());
        laboratoryInvestigationCommand.setEstimatedTurnaround(source.getEstimatedTurnaround());

        if(source.getExperimentResultParameters().size()>0 && source.getExperimentResultParameters()!=null)
            source.getExperimentResultParameters().forEach(experimentParameters ->
                    laboratoryInvestigationCommand.getExperimentParametersCommands().add(
                            experimentParameterToExperimentParameterCommand.convert(experimentParameters)
                    ));

        if(source.getInvestigationGroups()!=null)
            laboratoryInvestigationCommand.setInvestigationGroupId(source.getInvestigationGroups().getId());

        laboratoryInvestigationCommand.setInvestigationType(source.getInvestigationType());

//        if(source.getLabPackages()!=null && source.getLabPackages().size()>0)
//            source.getLabPackages().forEach(packages -> laboratoryInvestigationCommand.getPackageCommand().add(
//                    packageToPackageCommand.convert(packages)
//            ));

        laboratoryInvestigationCommand.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getServicePriceCode()));
        laboratoryInvestigationCommand.setTitle(source.getTitle());

        return laboratoryInvestigationCommand;
    }
}
