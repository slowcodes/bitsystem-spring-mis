package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.LaboratoryTransactionPayments;
import ng.com.bitsystems.mis.repositories.accounts.payments.LaboratoryTransactionPaymentRepository;
import ng.com.bitsystems.mis.services.accounts.payments.LaboratoryTransactionPaymentService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class LaboratoryPaymentsSDPaService implements LaboratoryTransactionPaymentService {
    private LaboratoryTransactionPaymentRepository paymentRepository;

    public LaboratoryPaymentsSDPaService(LaboratoryTransactionPaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Set<LaboratoryTransactionPayments> findAll() {
        Set<LaboratoryTransactionPayments> laboratoryTransactionPayments = new HashSet<>();
        paymentRepository.findAll().forEach(laboratoryTransactionPayments::add);
        return null;
    }

    @Override
    public LaboratoryTransactionPayments findByID(Long aLong) {
        return paymentRepository.findById(aLong).get();
    }

    @Override
    public LaboratoryTransactionPayments add(LaboratoryTransactionPayments object) {
        return paymentRepository.save(object);
    }

    @Override
    public void delete(LaboratoryTransactionPayments object) {
        paymentRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        paymentRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(LaboratoryTransactionPayments object) {

    }
}
