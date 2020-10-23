package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.RetailMeasureCommand;
import ng.com.bitsystems.mis.models.pharmacy.RetailMeasure;
import org.springframework.core.convert.converter.Converter;

public class RetailMeasureToRetailMeasureCommand implements Converter<RetailMeasure, RetailMeasureCommand> {
    @Override
    public RetailMeasureCommand convert(RetailMeasure source) {
        return null;
    }
}
