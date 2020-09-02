package ng.com.bitsystems.mis.repositories.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.PharmacyTransactionPayments;
import org.springframework.data.repository.CrudRepository;

public interface PharmacyPaymentRepository extends CrudRepository<PharmacyTransactionPayments, Long> {
}
