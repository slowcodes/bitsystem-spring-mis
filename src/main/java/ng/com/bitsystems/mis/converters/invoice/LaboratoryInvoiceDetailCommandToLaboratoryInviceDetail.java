package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.LaboratoryInvoiceDetailCommand;
import ng.com.bitsystems.mis.models.invoice.LaboratoryInvoiceDetails;
import org.springframework.core.convert.converter.Converter;

public class LaboratoryInvoiceDetailCommandToLaboratoryInviceDetail
implements Converter<LaboratoryInvoiceDetailCommand, LaboratoryInvoiceDetails> {
    @Override
    public LaboratoryInvoiceDetails convert(LaboratoryInvoiceDetailCommand source) {
        return null;
    }
}
