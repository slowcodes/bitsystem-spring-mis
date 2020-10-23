package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.RetailMeasureCommand;
import ng.com.bitsystems.mis.models.pharmacy.RetailMeasure;
import org.springframework.core.convert.converter.Converter;

public class RetailMeasureCommandToRetailMeasure implements Converter<RetailMeasureCommand, RetailMeasure> {
    @Override
    public RetailMeasure convert(RetailMeasureCommand source) {
        return null;
    }
}
