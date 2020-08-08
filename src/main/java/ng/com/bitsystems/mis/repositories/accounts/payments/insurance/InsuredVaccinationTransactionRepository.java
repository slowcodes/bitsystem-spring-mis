package ng.com.bitsystems.mis.repositories.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredVaccinationTransactions;
import org.springframework.data.repository.CrudRepository;

public interface InsuredVaccinationTransactionRepository extends CrudRepository<InsuredVaccinationTransactions, Long> {
}
