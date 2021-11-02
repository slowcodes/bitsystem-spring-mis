package ng.com.bitsystems.mis.services.springdatajpa.transactions.otherservices;

import ng.com.bitsystems.mis.models.transactions.otherservices.OtherServiceTransaction;
import ng.com.bitsystems.mis.repositories.transactions.otherservices.OtherServiceTransactionRepository;
import ng.com.bitsystems.mis.services.transactions.otherservices.OtherServiceTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OtherServiceTransactionSDJPaService implements OtherServiceTransactionService {
    private OtherServiceTransactionRepository otherServiceTransactionRepository;

    public OtherServiceTransactionSDJPaService(OtherServiceTransactionRepository otherServiceTransactionRepository) {
        this.otherServiceTransactionRepository = otherServiceTransactionRepository;
    }

    @Override
    public Set<OtherServiceTransaction> findAll() {
        Set<OtherServiceTransaction> otherServiceTransactions = new HashSet<>();
        otherServiceTransactionRepository.findAll().forEach(otherServiceTransactions::add);
        return otherServiceTransactions;
    }

    @Override
    public OtherServiceTransaction findByID(Long aLong) {
        return otherServiceTransactionRepository.findById(aLong).get();
    }

    @Override
    public OtherServiceTransaction add(OtherServiceTransaction object) {
        return otherServiceTransactionRepository.save(object);
    }

    @Override
    public void delete(OtherServiceTransaction object) {
        otherServiceTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        otherServiceTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OtherServiceTransaction object) {

    }
}
