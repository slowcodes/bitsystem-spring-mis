package ng.com.bitsystems.mis.repositories.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredPharmacyTransactions;
import org.springframework.data.repository.CrudRepository;

public interface InsuredPharmacyTransactionRepository extends CrudRepository<InsuredPharmacyTransactions, Long> {
}
