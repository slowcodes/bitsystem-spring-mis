package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredPharmacyTransactions;
import ng.com.bitsystems.mis.repositories.accounts.payments.insurance.InsuredPharmacyTransactionRepository;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.InsuredPharmacyTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InsuredPharmacyTransactionSDJPaService implements InsuredPharmacyTransactionService {

    private InsuredPharmacyTransactionRepository insuredPharmacyTransactionRepository;

    public InsuredPharmacyTransactionSDJPaService(InsuredPharmacyTransactionRepository insuredPharmacyTransactionRepository) {
        this.insuredPharmacyTransactionRepository = insuredPharmacyTransactionRepository;
    }

    @Override
    public Set<InsuredPharmacyTransactions> findAll() {
        Set<InsuredPharmacyTransactions> insuredPharmacyTransactions = new HashSet<>();
        insuredPharmacyTransactionRepository.findAll().forEach(insuredPharmacyTransactions::add);
        return insuredPharmacyTransactions;
    }

    @Override
    public InsuredPharmacyTransactions findByID(Long aLong) {
        return insuredPharmacyTransactionRepository.findById(aLong).get();
    }

    @Override
    public InsuredPharmacyTransactions add(InsuredPharmacyTransactions object) {
        return insuredPharmacyTransactionRepository.save(object);
    }

    @Override
    public void delete(InsuredPharmacyTransactions object) {
        insuredPharmacyTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        insuredPharmacyTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InsuredPharmacyTransactions object) {

    }
}
