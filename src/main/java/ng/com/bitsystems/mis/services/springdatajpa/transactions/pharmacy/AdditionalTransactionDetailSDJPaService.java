package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionDetails;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.AdditionalTransactionDetailsRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.AdditionalTransactionDetailService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AdditionalTransactionDetailSDJPaService implements AdditionalTransactionDetailService {
    private AdditionalTransactionDetailsRepository additionalTransactionDetailsRepository;

    public AdditionalTransactionDetailSDJPaService(AdditionalTransactionDetailsRepository additionalTransactionDetailsRepository) {
        this.additionalTransactionDetailsRepository = additionalTransactionDetailsRepository;
    }

    @Override
    public Set<AdditionalTransactionDetails> findAll() {
        Set<AdditionalTransactionDetails> additionalSupplyTransactionDetails =new HashSet<>();
        additionalTransactionDetailsRepository.findAll().forEach(additionalSupplyTransactionDetails::add);
        return additionalSupplyTransactionDetails;
    }

    @Override
    public AdditionalTransactionDetails findByID(Long aLong) {
        return additionalTransactionDetailsRepository.findById(aLong).get();
    }

    @Override
    public AdditionalTransactionDetails add(AdditionalTransactionDetails object) {
        return additionalTransactionDetailsRepository.save(object);
    }

    @Override
    public void delete(AdditionalTransactionDetails object) {
        additionalTransactionDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        additionalTransactionDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(AdditionalTransactionDetails object) {

    }
}
