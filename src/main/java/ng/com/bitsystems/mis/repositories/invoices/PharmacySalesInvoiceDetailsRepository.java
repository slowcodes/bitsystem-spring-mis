package ng.com.bitsystems.mis.repositories.invoices;

import ng.com.bitsystems.mis.models.invoice.PharmacyInvoiceDetailsSale;
import org.springframework.data.repository.CrudRepository;

public interface PharmacySalesInvoiceDetailsRepository extends CrudRepository<PharmacyInvoiceDetailsSale, Long> {
}
