package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ExperimentParametersCommand;
import ng.com.bitsystems.mis.models.laboratories.ExperimentParameters;
import ng.com.bitsystems.mis.models.laboratories.Investigations;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ExperimentParameterCommandToExperimentParameter implements
        Converter<ExperimentParametersCommand, ExperimentParameters> {

    @Nullable
    @Override
    public ExperimentParameters convert(ExperimentParametersCommand source) {

        if(source==null)
            return null;

        final ExperimentParameters experimentParameters = new ExperimentParameters();
        experimentParameters.setId(source.getId());

        if(source.getLaboratoryInvestigationsId()!=null){
            Investigations investigations = new Investigations();
            investigations.setId(source.getId());
            experimentParameters.setInvestigations(investigations);
            Investigations labInv = investigations.addExperimentParameter(experimentParameters);
        }

        experimentParameters.setMax(source.getMax());
        experimentParameters.setMin(source.getMin());
        experimentParameters.setParameter(source.getParameter());
        experimentParameters.setPresentation(source.getPresentation());
        experimentParameters.setUnit(source.getUnit());
        experimentParameters.setValueDataType(source.getValueDataType());

        return experimentParameters;
    }
}
