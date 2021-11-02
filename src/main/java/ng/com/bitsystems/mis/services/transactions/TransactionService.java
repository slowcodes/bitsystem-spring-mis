package ng.com.bitsystems.mis.services.transactions;

import ng.com.bitsystems.mis.models.transactions.Transaction;
import ng.com.bitsystems.mis.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService extends CrudService<Transaction, Long> {
}
