package ng.com.bitsystems.mis.services.springdatajpa.transactions.laboratory.bloodbank;

import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransactionDetails;
import ng.com.bitsystems.mis.repositories.transactions.laboratory.bloodbank.BloodBankTransactionDetailsRepository;
import ng.com.bitsystems.mis.services.transactions.laboratory.bloodbank.BloodBankTransactionDetailsService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BloodBankTransactionDetailsSDJPaService implements BloodBankTransactionDetailsService {

    private BloodBankTransactionDetailsRepository bloodBankTransactionDetailsRepository;

    public BloodBankTransactionDetailsSDJPaService(BloodBankTransactionDetailsRepository bloodBankTransactionDetailsRepository) {
        this.bloodBankTransactionDetailsRepository = bloodBankTransactionDetailsRepository;
    }

    @Override
    public Set<BloodbankTransactionDetails> findAll() {
        Set<BloodbankTransactionDetails> transactionDetails=new HashSet<>();
        bloodBankTransactionDetailsRepository.findAll().forEach(transactionDetails::add);
        return transactionDetails;
    }

    @Override
    public BloodbankTransactionDetails findByID(Long aLong) {
        return bloodBankTransactionDetailsRepository.findById(aLong).get();
    }

    @Override
    public BloodbankTransactionDetails add(BloodbankTransactionDetails object) {
        return bloodBankTransactionDetailsRepository.save(object);
    }

    @Override
    public void delete(BloodbankTransactionDetails object) {
        bloodBankTransactionDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        bloodBankTransactionDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(BloodbankTransactionDetails object) {

    }
}
