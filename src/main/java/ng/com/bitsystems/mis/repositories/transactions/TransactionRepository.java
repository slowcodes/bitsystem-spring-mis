package ng.com.bitsystems.mis.repositories.transactions;

import ng.com.bitsystems.mis.models.transactions.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
