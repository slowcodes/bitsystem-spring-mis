package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredVaccinationTransactions;
import ng.com.bitsystems.mis.repositories.accounts.payments.insurance.InsuredVaccinationTransactionRepository;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.InsuredVaccinationTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InsuredVaccinationTransactionSDJPaService implements InsuredVaccinationTransactionService {

    private InsuredVaccinationTransactionRepository insuredVaccinationTransactionRepository;

    public InsuredVaccinationTransactionSDJPaService(InsuredVaccinationTransactionRepository insuredVaccinationTransactionRepository) {
        this.insuredVaccinationTransactionRepository = insuredVaccinationTransactionRepository;
    }

    @Override
    public Set<InsuredVaccinationTransactions> findAll() {
        Set<InsuredVaccinationTransactions> insuredVaccinationTransactions = new HashSet<>();
        insuredVaccinationTransactionRepository.findAll().forEach(insuredVaccinationTransactions::add);
        return insuredVaccinationTransactions;
    }


    @Override
    public InsuredVaccinationTransactions findByID(Long aLong) {
        return insuredVaccinationTransactionRepository.findById(aLong).get();
    }

    @Override
    public InsuredVaccinationTransactions add(InsuredVaccinationTransactions object) {
        return insuredVaccinationTransactionRepository.save(object);
    }

    @Override
    public void delete(InsuredVaccinationTransactions object) {
        insuredVaccinationTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        insuredVaccinationTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InsuredVaccinationTransactions object) {

    }
}
