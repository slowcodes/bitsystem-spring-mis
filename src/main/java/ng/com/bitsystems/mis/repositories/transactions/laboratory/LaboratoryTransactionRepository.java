package ng.com.bitsystems.mis.repositories.transactions.laboratory;

import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import org.springframework.data.repository.CrudRepository;

public interface LaboratoryTransactionRepository extends CrudRepository<LaboratoryTransaction, Long> {
}
