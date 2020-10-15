package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactionsDetails;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.PharmacySupplyTransactionDetailsRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.PharmacySupplyTransactionDetailsService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PharmacySupplyTransactionDetailsSDJPaService implements PharmacySupplyTransactionDetailsService {
    private PharmacySupplyTransactionDetailsRepository transactionDetailsRepository;

    public PharmacySupplyTransactionDetailsSDJPaService(PharmacySupplyTransactionDetailsRepository transactionDetailsRepository) {
        this.transactionDetailsRepository = transactionDetailsRepository;
    }

    @Override
    public Set<PharmacySupplyTransactionsDetails> findAll() {
        Set<PharmacySupplyTransactionsDetails> pharmacySupplyTransactionsDetails=new HashSet<>();
        transactionDetailsRepository.findAll().forEach(pharmacySupplyTransactionsDetails::add);
        return pharmacySupplyTransactionsDetails;
    }

    @Override
    public PharmacySupplyTransactionsDetails findByID(Long aLong) {
        return transactionDetailsRepository.findById(aLong).get();
    }

    @Override
    public PharmacySupplyTransactionsDetails add(PharmacySupplyTransactionsDetails object) {
        return transactionDetailsRepository.save(object);
    }

    @Override
    public void delete(PharmacySupplyTransactionsDetails object) {
        transactionDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        transactionDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacySupplyTransactionsDetails object) {

    }
}
