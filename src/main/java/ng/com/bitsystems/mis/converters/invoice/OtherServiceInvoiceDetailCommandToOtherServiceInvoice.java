package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.OtherServiceInvoiceDetailCommand;
import ng.com.bitsystems.mis.models.invoice.OtherServiceInvoiceDetails;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceInvoiceDetailCommandToOtherServiceInvoice
implements Converter<OtherServiceInvoiceDetailCommand, OtherServiceInvoiceDetails> {
    @Override
    public OtherServiceInvoiceDetails convert(OtherServiceInvoiceDetailCommand source) {
        return null;
    }
}
