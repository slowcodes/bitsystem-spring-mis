package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.PharmacyTransactionPayments;
import ng.com.bitsystems.mis.repositories.accounts.payments.PharmacyPaymentRepository;
import ng.com.bitsystems.mis.services.accounts.payments.PharmacyPaymentSalesService;

import java.util.HashSet;
import java.util.Set;

public class PharmacyPaymentsSDJPaService implements PharmacyPaymentSalesService {
    private PharmacyPaymentRepository pharmacyPaymentRepository;

    public PharmacyPaymentsSDJPaService(PharmacyPaymentRepository pharmacyPaymentRepository) {
        this.pharmacyPaymentRepository = pharmacyPaymentRepository;
    }

    @Override
    public Set<PharmacyTransactionPayments> findAll() {
        Set<PharmacyTransactionPayments> pharmacyTransactionPayments = new HashSet<>();
        pharmacyPaymentRepository.findAll().forEach(pharmacyTransactionPayments::add);
        return pharmacyTransactionPayments;
    }

    @Override
    public PharmacyTransactionPayments findByID(Long aLong) {
        return pharmacyPaymentRepository.findById(aLong).get();
    }

    @Override
    public PharmacyTransactionPayments add(PharmacyTransactionPayments object) {
        return pharmacyPaymentRepository.save(object);
    }

    @Override
    public void delete(PharmacyTransactionPayments object) {
        pharmacyPaymentRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pharmacyPaymentRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacyTransactionPayments object) {

    }
}
