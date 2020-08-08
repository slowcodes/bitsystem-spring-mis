package ng.com.bitsystems.mis.repositories.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.LaboratoryTransactionPayments;
import org.springframework.data.repository.CrudRepository;

public interface LaboratoryTransactionPaymentRepository extends CrudRepository<LaboratoryTransactionPayments, Long> {
}
