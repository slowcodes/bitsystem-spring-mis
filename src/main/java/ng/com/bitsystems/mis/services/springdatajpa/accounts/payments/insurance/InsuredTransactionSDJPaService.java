package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuranceTransactions;
import ng.com.bitsystems.mis.repositories.accounts.payments.insurance.InsuredTransactionRepository;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.InsuredTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InsuredTransactionSDJPaService implements InsuredTransactionService {

    private InsuredTransactionRepository insuredTransactionRepository;

    public InsuredTransactionSDJPaService(InsuredTransactionRepository insuredTransactionRepository) {
        this.insuredTransactionRepository = insuredTransactionRepository;
    }

    @Override
    public Set<InsuranceTransactions> findAll() {
        Set<InsuranceTransactions> insuredTransactions = new HashSet<>();
        insuredTransactionRepository.findAll().forEach(insuredTransactions::add);
        return insuredTransactions;
    }

    @Override
    public InsuranceTransactions findByID(Long aLong) {
        return insuredTransactionRepository.findById(aLong).get();
    }

    @Override
    public InsuranceTransactions add(InsuranceTransactions object) {
        return insuredTransactionRepository.save(object);
    }

    @Override
    public void delete(InsuranceTransactions object) {
        insuredTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        insuredTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InsuranceTransactions object) {

    }
}
