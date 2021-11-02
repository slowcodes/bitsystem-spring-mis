package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.Payments;
import ng.com.bitsystems.mis.repositories.accounts.payments.PaymentRepository;
import ng.com.bitsystems.mis.services.accounts.payments.PaymentsService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PaymentSDJPaService implements PaymentsService {
    private PaymentRepository paymentRepository;

    public PaymentSDJPaService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Set<Payments> findAll() {
        Set<Payments> payments = new HashSet<>();
        paymentRepository.findAll().forEach(payments::add);
        return payments;
    }

    @Override
    public Payments findByID(Long aLong) {
        return paymentRepository.findById(aLong).get();
    }


    @Override
    public Payments add(Payments object) {
        return paymentRepository.save(object);
    }

    @Override
    public void delete(Payments object) {
        paymentRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        paymentRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Payments object) {

    }
}
