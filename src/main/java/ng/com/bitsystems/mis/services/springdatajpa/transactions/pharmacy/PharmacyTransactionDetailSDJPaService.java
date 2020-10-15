package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.PharmacySalesTransactionDetailsRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.PharmacyTransactionDetailService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PharmacyTransactionDetailSDJPaService implements PharmacyTransactionDetailService {
    private PharmacySalesTransactionDetailsRepository pharmacySalesTransactionDetailsRepository;

    public PharmacyTransactionDetailSDJPaService(PharmacySalesTransactionDetailsRepository pharmacySalesTransactionDetailsRepository) {
        this.pharmacySalesTransactionDetailsRepository = pharmacySalesTransactionDetailsRepository;
    }

    @Override
    public Set<PharmacyTransactionDetails> findAll() {
        Set<PharmacyTransactionDetails> pharmacyTransactionDetails=new HashSet<>();
        pharmacySalesTransactionDetailsRepository.findAll().forEach(pharmacyTransactionDetails::add);
        return pharmacyTransactionDetails;
    }

    @Override
    public PharmacyTransactionDetails findByID(Long aLong) {
        return pharmacySalesTransactionDetailsRepository.findById(aLong).get();
    }

    @Override
    public PharmacyTransactionDetails add(PharmacyTransactionDetails object) {
        return pharmacySalesTransactionDetailsRepository.save(object);
    }

    @Override
    public void delete(PharmacyTransactionDetails object) {
        pharmacySalesTransactionDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pharmacySalesTransactionDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacyTransactionDetails object) {

    }
}
