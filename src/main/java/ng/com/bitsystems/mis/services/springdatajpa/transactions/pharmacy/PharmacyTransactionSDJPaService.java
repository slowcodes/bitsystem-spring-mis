package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.PharmacySalesTransactionRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.PharmacyTransactionService;

import java.util.HashSet;
import java.util.Set;

public class PharmacyTransactionSDJPaService implements PharmacyTransactionService {

    private PharmacySalesTransactionRepository pharmacySalesTransactionRepository;

    public PharmacyTransactionSDJPaService(PharmacySalesTransactionRepository pharmacySalesTransactionRepository) {
        this.pharmacySalesTransactionRepository = pharmacySalesTransactionRepository;
    }

    @Override
    public Set<PharmacySalesTransaction> findAll() {
        Set<PharmacySalesTransaction> pharmacySalesTransactions=new HashSet<>();
        pharmacySalesTransactionRepository.findAll().forEach(pharmacySalesTransactions::add);
        return pharmacySalesTransactions;
    }

    @Override
    public PharmacySalesTransaction findByID(Long aLong) {
        return pharmacySalesTransactionRepository.findById(aLong).get();
    }

    @Override
    public PharmacySalesTransaction add(PharmacySalesTransaction object) {
        return pharmacySalesTransactionRepository.save(object);
    }

    @Override
    public void delete(PharmacySalesTransaction object) {
        pharmacySalesTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pharmacySalesTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacySalesTransaction object) {

    }
}
