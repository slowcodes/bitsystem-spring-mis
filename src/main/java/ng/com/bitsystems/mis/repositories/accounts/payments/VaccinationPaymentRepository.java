package ng.com.bitsystems.mis.repositories.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.VaccinationTransactionsPayments;
import org.springframework.data.repository.CrudRepository;

public interface VaccinationPaymentRepository extends CrudRepository<VaccinationTransactionsPayments, Long> {
}
