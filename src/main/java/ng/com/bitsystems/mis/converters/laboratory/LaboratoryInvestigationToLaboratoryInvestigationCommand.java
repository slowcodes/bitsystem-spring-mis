package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class LaboratoryInvestigationToLaboratoryInvestigationCommand implements Converter<LaboratoryInvestigations, LaboratoryInvestigationCommand> {

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
    public LaboratoryInvestigationCommand convert(LaboratoryInvestigations source) {

        if(source==null){
            return null;
        }
        LaboratoryInvestigationCommand laboratoryInvestigationCommand = new
                LaboratoryInvestigationCommand();

        laboratoryInvestigationCommand.setId(source.getId());
        laboratoryInvestigationCommand.setDesc(source.getDesc());
        laboratoryInvestigationCommand.setEstimatedTurnaround(source.getEstimatedTurnaround());

        if(source.getExperimentResultParameters().size()>0 && source.getExperimentResultParameters()!=null)
            source.getExperimentResultParameters().forEach(experimentParameters ->
                    laboratoryInvestigationCommand.getExperimentParametersCommands().add(
                            experimentParameterToExperimentParameterCommand.convert(experimentParameters)
                    ));

        if(source.getInvestigationGroups()!=null)
            laboratoryInvestigationCommand.setInvestigationGroupId(source.getInvestigationGroups().getId());

        laboratoryInvestigationCommand.setInvestigationType(source.getInvestigationType());

        if(source.getPackages()!=null && source.getPackages().size()>0)
            source.getPackages().forEach(packages -> laboratoryInvestigationCommand.getPackageCommand().add(
                    packageToPackageCommand.convert(packages)
            ));

        laboratoryInvestigationCommand.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getServicePriceCode()));
        laboratoryInvestigationCommand.setTitle(source.getTitle());

        return laboratoryInvestigationCommand;
    }
}
