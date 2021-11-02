package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.RetailMeasureCommand;
import ng.com.bitsystems.mis.models.pharmacy.RetailMeasure;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RetailMeasureCommandToRetailMeasure implements Converter<RetailMeasureCommand, RetailMeasure> {
    @Override
    public RetailMeasure convert(RetailMeasureCommand source) {
        if (source==null)
            return null;

        final RetailMeasure retailMeasure = new RetailMeasure();
        retailMeasure.setMesures(source.getMesures());
        retailMeasure.setMetric(source.getMetric());
        retailMeasure.setId(source.getId());

        return retailMeasure;
    }
}
