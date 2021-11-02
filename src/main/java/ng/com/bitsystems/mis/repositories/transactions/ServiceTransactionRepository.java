package ng.com.bitsystems.mis.repositories.transactions;

import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;
import org.springframework.data.repository.CrudRepository;

public interface ServiceTransactionRepository extends CrudRepository<ServiceTransaction, Long> {
}
