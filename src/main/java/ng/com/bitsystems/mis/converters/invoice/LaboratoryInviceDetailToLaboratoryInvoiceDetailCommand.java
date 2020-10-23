package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.LaboratoryInvoiceDetailCommand;
import ng.com.bitsystems.mis.models.invoice.LaboratoryInvoiceDetails;
import org.springframework.core.convert.converter.Converter;

public class LaboratoryInviceDetailToLaboratoryInvoiceDetailCommand
implements Converter<LaboratoryInvoiceDetails, LaboratoryInvoiceDetailCommand> {
    @Override
    public LaboratoryInvoiceDetailCommand convert(LaboratoryInvoiceDetails source) {
        return null;
    }
}
