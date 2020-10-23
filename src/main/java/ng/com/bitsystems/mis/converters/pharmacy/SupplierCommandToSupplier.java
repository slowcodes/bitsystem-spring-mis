package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.SupplierCommand;
import ng.com.bitsystems.mis.models.pharmacy.Suppliers;
import org.springframework.core.convert.converter.Converter;

public class SupplierCommandToSupplier
implements Converter<SupplierCommand, Suppliers> {
    @Override
    public Suppliers convert(SupplierCommand source) {
        return null;
    }
}
