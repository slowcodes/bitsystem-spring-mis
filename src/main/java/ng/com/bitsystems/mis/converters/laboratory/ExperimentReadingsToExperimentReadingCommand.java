package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ExperimentReadingCommand;
import ng.com.bitsystems.mis.models.laboratories.ExperimentReadings;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ExperimentReadingsToExperimentReadingCommand implements Converter<ExperimentReadings, ExperimentReadingCommand> {
    @Override
    public ExperimentReadingCommand convert(ExperimentReadings source) {
        if(source==null)
            return null;

        ExperimentReadingCommand experimentReadingCommand=new ExperimentReadingCommand();
        experimentReadingCommand.setId(source.getId());
        experimentReadingCommand.setColor(source.getColor());

        if(source.getCollectedSamples()!=null){
            experimentReadingCommand.setCollectedSamplesId(source.getCollectedSamples().getId());
        }

        experimentReadingCommand.setValueOfParameter(source.getValueOfParameter());
        experimentReadingCommand.setValueOfParameter(source.getValueOfParameter());

        if(source.getLaboratoryTransactionDetail()!=null){
            experimentReadingCommand.setLaboratoryTransactionDetailId(source.getLaboratoryTransactionDetail().getId());
        }
        
        return experimentReadingCommand;
    }
}
