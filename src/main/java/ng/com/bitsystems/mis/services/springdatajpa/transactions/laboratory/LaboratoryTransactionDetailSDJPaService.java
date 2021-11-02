package ng.com.bitsystems.mis.services.springdatajpa.transactions.laboratory;

import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import ng.com.bitsystems.mis.repositories.transactions.laboratory.LaboratoryTransactionDetailsRepository;
import ng.com.bitsystems.mis.services.transactions.laboratory.LaboaratoryTransactionDetailService;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class LaboratoryTransactionDetailSDJPaService implements LaboaratoryTransactionDetailService {
    private LaboratoryTransactionDetailsRepository transactionDetailsRepository;

    public LaboratoryTransactionDetailSDJPaService(LaboratoryTransactionDetailsRepository transactionDetailsRepository) {
        this.transactionDetailsRepository = transactionDetailsRepository;
    }

    @Override
    public Set<LaboratoryTransactionDetail> findAll() {
        Set<LaboratoryTransactionDetail> laboratoryTransactionDetails = new HashSet<>();
        transactionDetailsRepository.findAll().forEach(laboratoryTransactionDetails::add);
        return laboratoryTransactionDetails;
    }

    @Override
    public LaboratoryTransactionDetail findByID(Long aLong) {
        return transactionDetailsRepository.findById(aLong).get();
    }

    @Override
    public LaboratoryTransactionDetail add(LaboratoryTransactionDetail object) {
        return transactionDetailsRepository.save(object);
    }

    @Override
    public void delete(LaboratoryTransactionDetail object) {
        transactionDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        transactionDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(LaboratoryTransactionDetail object) {

    }
}
