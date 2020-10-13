package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionDetails;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.AdditionalTransactionDetailsRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.AdditionalTransactionDetailService;

import java.util.HashSet;
import java.util.Set;

public class AdditionalTransactionDetailSDJPaService implements AdditionalTransactionDetailService {
    private AdditionalTransactionDetailsRepository additionalTransactionDetailsRepository;

    public AdditionalTransactionDetailSDJPaService(AdditionalTransactionDetailsRepository additionalTransactionDetailsRepository) {
        this.additionalTransactionDetailsRepository = additionalTransactionDetailsRepository;
    }

    @Override
    public Set<AdditionalTransactionDetails> findAll() {
        Set<AdditionalTransactionDetails> additionalTransactionDetails=new HashSet<>();
        additionalTransactionDetailsRepository.findAll().forEach(additionalTransactionDetails::add);
        return additionalTransactionDetails;
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
