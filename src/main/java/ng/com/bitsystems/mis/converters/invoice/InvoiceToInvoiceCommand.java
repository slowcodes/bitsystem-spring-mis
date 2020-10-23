package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.InvoiceCommand;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import org.springframework.core.convert.converter.Converter;

public class InvoiceToInvoiceCommand implements Converter<Invoice, InvoiceCommand> {
    @Override
    public InvoiceCommand convert(Invoice source) {
        return null;
    }
}
