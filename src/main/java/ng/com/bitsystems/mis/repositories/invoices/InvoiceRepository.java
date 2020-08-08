package ng.com.bitsystems.mis.repositories.invoices;

import ng.com.bitsystems.mis.models.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}
