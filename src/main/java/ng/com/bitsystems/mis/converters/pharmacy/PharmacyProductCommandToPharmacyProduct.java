package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import org.springframework.core.convert.converter.Converter;

public class PharmacyProductCommandToPharmacyProduct implements Converter<PharmacyProductCommand, PharmacyProducts> {
    @Override
    public PharmacyProducts convert(PharmacyProductCommand source) {
        return null;
    }
}
