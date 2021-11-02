package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.RetailMeasureCommand;
import ng.com.bitsystems.mis.models.pharmacy.RetailMeasure;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RetailMeasureToRetailMeasureCommand implements Converter<RetailMeasure, RetailMeasureCommand> {
    @Override
    public RetailMeasureCommand convert(RetailMeasure source) {
        if (source==null)
            return null;

        final RetailMeasureCommand retailMeasureCommand = new RetailMeasureCommand();
        retailMeasureCommand.setId(source.getId());
        retailMeasureCommand.setMesures(source.getMesures());
        retailMeasureCommand.setMetric(source.getMetric());
        return retailMeasureCommand;
    }
}
