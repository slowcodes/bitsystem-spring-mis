package ng.com.bitsystems.mis.repositories.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuranceTransactions;
import org.springframework.data.repository.CrudRepository;

public interface InsuredTransactionRepository extends CrudRepository<InsuranceTransactions, Long> {
}
