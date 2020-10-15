package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactions;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.PharmacySupplyTransactionRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.PharmacySupplyTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PharmacySupplyTransactionSDJPaService implements PharmacySupplyTransactionService {
    private PharmacySupplyTransactionRepository supplyTransactionRepository;

    public PharmacySupplyTransactionSDJPaService(PharmacySupplyTransactionRepository supplyTransactionRepository) {
        this.supplyTransactionRepository = supplyTransactionRepository;
    }

    @Override
    public Set<PharmacySupplyTransactions> findAll() {
        Set<PharmacySupplyTransactions> pharmacySupplyTransactions=new HashSet<>();
        supplyTransactionRepository.findAll().forEach(pharmacySupplyTransactions::add);
        return pharmacySupplyTransactions;
    }

    @Override
    public PharmacySupplyTransactions findByID(Long aLong) {
        return supplyTransactionRepository.findById(aLong).get();
    }

    @Override
    public PharmacySupplyTransactions add(PharmacySupplyTransactions object) {
        return supplyTransactionRepository.save(object);
    }

    @Override
    public void delete(PharmacySupplyTransactions object) {
        supplyTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        supplyTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacySupplyTransactions object) {

    }
}
