package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.OtherServicePayments;
import ng.com.bitsystems.mis.repositories.accounts.payments.OtherServicePaymentRepository;
import ng.com.bitsystems.mis.services.accounts.payments.OtherServicePaymentService;

import java.util.HashSet;
import java.util.Set;

public class OtherServicePaymentSDJPaService implements OtherServicePaymentService {
    private OtherServicePaymentRepository otherServicePaymentRepository;

    public OtherServicePaymentSDJPaService(OtherServicePaymentRepository otherServicePaymentRepository) {
        this.otherServicePaymentRepository = otherServicePaymentRepository;
    }

    @Override
    public Set<OtherServicePayments> findAll() {
        Set<OtherServicePayments> otherServicePayments = new HashSet<>();
        otherServicePaymentRepository.findAll().forEach(otherServicePayments::add);
        return otherServicePayments;
    }

    @Override
    public OtherServicePayments findByID(Long aLong) {
        return otherServicePaymentRepository.findById(aLong).get();
    }

    @Override
    public OtherServicePayments add(OtherServicePayments object) {
        return otherServicePaymentRepository.save(object);
    }

    @Override
    public void delete(OtherServicePayments object) {
        otherServicePaymentRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        otherServicePaymentRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OtherServicePayments object) {

    }
}
