package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.OtherServiceInvoiceDetailCommand;
import ng.com.bitsystems.mis.models.invoice.OtherServiceInvoiceDetails;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceInvoiceToOtherServiceInvoiceDetailCommand
implements Converter<OtherServiceInvoiceDetails, OtherServiceInvoiceDetailCommand> {
    @Override
    public OtherServiceInvoiceDetailCommand convert(OtherServiceInvoiceDetails source) {
        return null;
    }
}
