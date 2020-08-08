package ng.com.bitsystems.mis.repositories.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactionsDetails;
import org.springframework.data.repository.CrudRepository;

public interface PharmacySalesTransactionDetailsRepository extends CrudRepository<PharmacySupplyTransactionsDetails, Long> {
}
