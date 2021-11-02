package ng.com.bitsystems.mis.services.springdatajpa.transactions;

import ng.com.bitsystems.mis.models.transactions.Transaction;
import ng.com.bitsystems.mis.repositories.transactions.TransactionRepository;
import ng.com.bitsystems.mis.services.transactions.TransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class TransactionSDJPaService implements TransactionService {
    private TransactionRepository transactionRepository;

    public TransactionSDJPaService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Set<Transaction> findAll() {
        Set<Transaction> transactions = new HashSet<>();
        transactionRepository.findAll().forEach(transactions::add);
        return transactions;
    }

    @Override
    public Transaction findByID(Long aLong) {
        return transactionRepository.findById(aLong).get();
    }

    @Override
    public Transaction add(Transaction object) {
        return transactionRepository.save(object);
    }

    @Override
    public void delete(Transaction object) {
        transactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        transactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Transaction object) {

    }
}
