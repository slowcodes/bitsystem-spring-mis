package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.PharmacyInvoiceDetailCommand;
import ng.com.bitsystems.mis.models.invoice.PharmacyInvoiceDetailsSale;
import org.springframework.core.convert.converter.Converter;

public class PharmacyInvoiceDetailCommandToPharmacyInvoiceDetail
implements Converter<PharmacyInvoiceDetailCommand, PharmacyInvoiceDetailsSale> {
    @Override
    public PharmacyInvoiceDetailsSale convert(PharmacyInvoiceDetailCommand source) {
        return null;
    }
}
