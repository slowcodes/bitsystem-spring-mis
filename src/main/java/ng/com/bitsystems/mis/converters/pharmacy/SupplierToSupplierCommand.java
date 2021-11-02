package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.SupplierCommand;
import ng.com.bitsystems.mis.models.pharmacy.Suppliers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class SupplierToSupplierCommand implements Converter<Suppliers, SupplierCommand> {
    @Nullable
    @Override
    public SupplierCommand convert(Suppliers source) {
        if (source==null)
            return null;

        SupplierCommand supplierCommand=new SupplierCommand();
        supplierCommand.setCompanyName(source.getCompanyName());
        supplierCommand.setEmail(source.getEmail());
        supplierCommand.setFirstName(source.getFirstName());
        supplierCommand.setLastName(source.getLastName());
        supplierCommand.setId(source.getId());
        supplierCommand.setMiddleName(source.getMiddleName());
        supplierCommand.setPhone(source.getPhone());
        supplierCommand.setSex(source.getSex());

        return supplierCommand;
    }
}
