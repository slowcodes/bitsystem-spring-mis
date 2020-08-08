package ng.com.bitsystems.mis.repositories.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import org.springframework.data.repository.CrudRepository;

public interface PharmacySalesTransactionRepository extends CrudRepository<PharmacySalesTransaction, Long> {
}
