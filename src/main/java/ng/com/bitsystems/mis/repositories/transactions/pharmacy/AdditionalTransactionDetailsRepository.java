package ng.com.bitsystems.mis.repositories.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalSupplyTransactionDetails;
import org.springframework.data.repository.CrudRepository;

public interface AdditionalTransactionDetailsRepository extends CrudRepository<AdditionalSupplyTransactionDetails, Long> {
}
