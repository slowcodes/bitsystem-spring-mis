package ng.com.bitsystems.mis.repositories.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.PharmacyTransactionPaymentsSales;
import org.springframework.data.repository.CrudRepository;

public interface PharmacyPaymentSalesRepository extends CrudRepository<PharmacyTransactionPaymentsSales, Long> {
}
