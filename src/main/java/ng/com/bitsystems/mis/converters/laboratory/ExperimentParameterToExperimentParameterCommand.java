package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ExperimentParametersCommand;
import ng.com.bitsystems.mis.models.laboratories.ExperimentParameters;
import org.springframework.core.convert.converter.Converter;

public class ExperimentParameterToExperimentParameterCommand implements
        Converter<ExperimentParameters, ExperimentParametersCommand> {
    @Override
    public ExperimentParametersCommand convert(ExperimentParameters source) {
        if(source==null)
            return null;

        final ExperimentParametersCommand experimentReadingCommand=new ExperimentParametersCommand();
        experimentReadingCommand.setId(source.getId());
        if(source.getLaboratoryInvestigations()!=null)
            experimentReadingCommand.setLaboratoryInvestigationsId(source.getLaboratoryInvestigations().getId());


        return experimentReadingCommand;
    }
}
