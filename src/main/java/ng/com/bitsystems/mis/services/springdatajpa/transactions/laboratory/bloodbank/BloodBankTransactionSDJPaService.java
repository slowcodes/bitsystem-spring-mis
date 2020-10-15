package ng.com.bitsystems.mis.services.springdatajpa.transactions.laboratory.bloodbank;

import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import ng.com.bitsystems.mis.repositories.transactions.laboratory.bloodbank.BloodBankTransactionRepository;
import ng.com.bitsystems.mis.services.transactions.laboratory.bloodbank.BloodbankTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BloodBankTransactionSDJPaService implements BloodbankTransactionService {
    private BloodBankTransactionRepository bloodBankTransactionRepository;

    public BloodBankTransactionSDJPaService(BloodBankTransactionRepository bloodBankTransactionRepository) {
        this.bloodBankTransactionRepository = bloodBankTransactionRepository;
    }

    @Override
    public Set<BloodbankTransaction> findAll() {
        Set<BloodbankTransaction> bloodbankTransactions = new HashSet<>();
        bloodBankTransactionRepository.findAll().forEach(bloodbankTransactions::add);
        return bloodbankTransactions;
    }

    @Override
    public BloodbankTransaction findByID(Long aLong) {
        return bloodBankTransactionRepository.findById(aLong).get();
    }

    @Override
    public BloodbankTransaction add(BloodbankTransaction object) {
        return bloodBankTransactionRepository.save(object);
    }

    @Override
    public void delete(BloodbankTransaction object) {
        bloodBankTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        bloodBankTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(BloodbankTransaction object) {

    }
}
