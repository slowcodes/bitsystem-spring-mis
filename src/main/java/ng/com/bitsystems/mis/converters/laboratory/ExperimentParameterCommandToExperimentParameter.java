package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ExperimentParametersCommand;
import ng.com.bitsystems.mis.models.laboratories.ExperimentParameters;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

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
            LaboratoryInvestigations laboratoryInvestigations = new  LaboratoryInvestigations();
            laboratoryInvestigations.setId(source.getId());
            experimentParameters.setLaboratoryInvestigations(laboratoryInvestigations);
            LaboratoryInvestigations labInv = laboratoryInvestigations.addExperimentParameter(experimentParameters);
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
