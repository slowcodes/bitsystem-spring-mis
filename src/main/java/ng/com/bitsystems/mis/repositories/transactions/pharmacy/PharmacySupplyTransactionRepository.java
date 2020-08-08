package ng.com.bitsystems.mis.repositories.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactions;
import org.springframework.data.repository.CrudRepository;

public interface PharmacySupplyTransactionRepository extends CrudRepository<PharmacySupplyTransactions, Long> {
}
