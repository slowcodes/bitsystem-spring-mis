package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.PharmacyTransactionDetailRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.PharmacyTransactionDetailService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PharmacyTransactionDetailSDJPaService implements PharmacyTransactionDetailService {
    private PharmacyTransactionDetailRepository pharmacyTransactionDetailRepository;

    public PharmacyTransactionDetailSDJPaService(PharmacyTransactionDetailRepository pharmacyTransactionDetailRepository) {
        this.pharmacyTransactionDetailRepository = pharmacyTransactionDetailRepository;
    }

    @Override
    public Set<PharmacyTransactionDetails> findAll() {
        Set<PharmacyTransactionDetails> pharmacyTransactionDetails=new HashSet<>();
        pharmacyTransactionDetailRepository.findAll().forEach(pharmacyTransactionDetails::add);
        return pharmacyTransactionDetails;
    }

    @Override
    public PharmacyTransactionDetails findByID(Long aLong) {
        return pharmacyTransactionDetailRepository.findById(aLong).get();
    }

    @Override
    public PharmacyTransactionDetails add(PharmacyTransactionDetails object) {
        return pharmacyTransactionDetailRepository.save(object);
    }

    @Override
    public void delete(PharmacyTransactionDetails object) {
        pharmacyTransactionDetailRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pharmacyTransactionDetailRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacyTransactionDetails object) {

    }
}
