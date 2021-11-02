package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.SupplierCommand;
import ng.com.bitsystems.mis.models.pharmacy.Suppliers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class SupplierCommandToSupplier
implements Converter<SupplierCommand, Suppliers> {

    @Nullable
    @Override
    public Suppliers convert(SupplierCommand source) {
        if (source==null)
            return null;

        Suppliers supplier=new Suppliers();

        supplier.setCompanyName(source.getCompanyName());
        supplier.setEmail(source.getEmail());
        supplier.setFirstName(source.getFirstName());
        supplier.setLastName(source.getLastName());
        supplier.setId(source.getId());
        supplier.setMiddleName(source.getMiddleName());
        supplier.setPhone(source.getPhone());
        supplier.setSex(source.getSex());

        return supplier;
    }
}
