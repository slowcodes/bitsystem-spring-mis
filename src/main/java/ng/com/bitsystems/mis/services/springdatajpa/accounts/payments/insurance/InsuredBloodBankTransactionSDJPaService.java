package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredBloodbankTransactions;
import ng.com.bitsystems.mis.repositories.accounts.payments.insurance.InsuredBloodBankTransactionRepository;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.InsuredBloodBankTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InsuredBloodBankTransactionSDJPaService implements InsuredBloodBankTransactionService {
    private InsuredBloodBankTransactionRepository insuredBloodBankTransactionRepository;

    public InsuredBloodBankTransactionSDJPaService(InsuredBloodBankTransactionRepository insuredBloodBankTransactionRepository) {
        this.insuredBloodBankTransactionRepository = insuredBloodBankTransactionRepository;
    }

    @Override
    public Set<InsuredBloodbankTransactions> findAll() {
        Set<InsuredBloodbankTransactions> insuredBloodbankTransactions = new HashSet<>();
        insuredBloodBankTransactionRepository.findAll().forEach(insuredBloodbankTransactions::add);
        return insuredBloodbankTransactions;
    }

    @Override
    public InsuredBloodbankTransactions findByID(Long aLong) {
        return insuredBloodBankTransactionRepository.findById(aLong).get();
    }

    @Override
    public InsuredBloodbankTransactions add(InsuredBloodbankTransactions object) {
        return insuredBloodBankTransactionRepository.save(object);
    }

    @Override
    public void delete(InsuredBloodbankTransactions object) {
        insuredBloodBankTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        insuredBloodBankTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InsuredBloodbankTransactions object) {

    }
}
