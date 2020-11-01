package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ExperimentReadingCommand;
import ng.com.bitsystems.mis.models.laboratories.CollectedSamples;
import ng.com.bitsystems.mis.models.laboratories.ExperimentReadings;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import org.springframework.core.convert.converter.Converter;

public class ExperimentReadingCommandToExperimentReading implements Converter<ExperimentReadingCommand, ExperimentReadings> {
    private ExperimentParameterCommandToExperimentParameter parameterCommandToExperimentParameter;
    @Override
    public ExperimentReadings convert(ExperimentReadingCommand source) {
        if(source==null)
            return null;

        final ExperimentReadings experimentReadings=new ExperimentReadings();
        experimentReadings.setId(source.getId());

        if(source.getCollectedSamplesId()!=null){
            CollectedSamples collectedSamples=new CollectedSamples();
            collectedSamples.setId(source.getCollectedSamplesId());
            experimentReadings.setCollectedSamples(collectedSamples);
            CollectedSamples samples = collectedSamples.addExperimentReading(experimentReadings);
        }

        experimentReadings.setColor(source.getColor());
        experimentReadings.setExperimentParameters(parameterCommandToExperimentParameter.convert(source.getExperimentParametersCommand()));
        experimentReadings.setValueOfParameter(source.getValueOfParameter());

        if(source.getLaboratoryTransactionDetailId()!=null){
            LaboratoryTransactionDetail laboratoryTransactionDetail = new LaboratoryTransactionDetail();
            laboratoryTransactionDetail.setId(source.getLaboratoryTransactionDetailId());
            experimentReadings.setLaboratoryTransactionDetail(laboratoryTransactionDetail);
            LaboratoryTransactionDetail labTxnDetail = laboratoryTransactionDetail.addExperimentReading(experimentReadings);
        }

        return experimentReadings;
    }
}
