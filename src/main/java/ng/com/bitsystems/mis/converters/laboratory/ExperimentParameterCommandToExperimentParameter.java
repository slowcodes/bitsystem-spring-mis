package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ExperimentParametersCommand;
import ng.com.bitsystems.mis.models.laboratories.ExperimentParameters;
import org.springframework.core.convert.converter.Converter;

public class ExperimentParameterCommandToExperimentParameter implements
        Converter<ExperimentParameters, ExperimentParametersCommand> {
    @Override
    public ExperimentParametersCommand convert(ExperimentParameters source) {
        return null;
    }
}
