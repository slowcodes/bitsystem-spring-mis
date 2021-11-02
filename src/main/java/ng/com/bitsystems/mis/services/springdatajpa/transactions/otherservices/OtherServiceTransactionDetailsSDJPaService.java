package ng.com.bitsystems.mis.services.springdatajpa.transactions.otherservices;

import ng.com.bitsystems.mis.models.transactions.otherservices.OtherServiceTransactionTransactionDetails;
import ng.com.bitsystems.mis.repositories.transactions.otherservices.OtherServiceTransactionDetailRepository;
import ng.com.bitsystems.mis.services.transactions.otherservices.OtherServiceTransactionDetailService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OtherServiceTransactionDetailsSDJPaService implements OtherServiceTransactionDetailService {
    private OtherServiceTransactionDetailRepository otherServiceTransactionDetailRepository;

    public OtherServiceTransactionDetailsSDJPaService(OtherServiceTransactionDetailRepository otherServiceTransactionDetailRepository) {
        this.otherServiceTransactionDetailRepository = otherServiceTransactionDetailRepository;
    }

    @Override
    public Set<OtherServiceTransactionTransactionDetails> findAll() {
        Set<OtherServiceTransactionTransactionDetails> otherServiceTransactionDetails = new HashSet<>();
        otherServiceTransactionDetailRepository.findAll().forEach(otherServiceTransactionDetails::add);
        return otherServiceTransactionDetails;
    }

    @Override
    public OtherServiceTransactionTransactionDetails findByID(Long aLong) {
        return otherServiceTransactionDetailRepository.findById(aLong).get();
    }

    @Override
    public OtherServiceTransactionTransactionDetails add(OtherServiceTransactionTransactionDetails object) {
        return otherServiceTransactionDetailRepository.save(object);
    }

    @Override
    public void delete(OtherServiceTransactionTransactionDetails object) {
        otherServiceTransactionDetailRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        otherServiceTransactionDetailRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OtherServiceTransactionTransactionDetails object) {

    }
}
