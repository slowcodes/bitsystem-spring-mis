package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.VaccinationTransactionsPayments;
import ng.com.bitsystems.mis.repositories.accounts.payments.VaccinationPaymentRepository;
import ng.com.bitsystems.mis.services.accounts.payments.VaccinationPaymentService;

import java.util.HashSet;
import java.util.Set;

public class VaccinationPaymentsSDJPaService implements VaccinationPaymentService {
    private VaccinationPaymentRepository vaccinationPaymentRepository;

    public VaccinationPaymentsSDJPaService(VaccinationPaymentRepository vaccinationPaymentRepository) {
        this.vaccinationPaymentRepository = vaccinationPaymentRepository;
    }

    @Override
    public Set<VaccinationTransactionsPayments> findAll() {
        Set<VaccinationTransactionsPayments> vaccinationTransactionsPayments = new HashSet<>();
        vaccinationPaymentRepository.findAll().forEach(vaccinationTransactionsPayments::add);
        return vaccinationTransactionsPayments;
    }

    @Override
    public VaccinationTransactionsPayments findByID(Long aLong) {

        return vaccinationPaymentRepository.findById(aLong).get();
    }

    @Override
    public VaccinationTransactionsPayments add(VaccinationTransactionsPayments object) {
        return vaccinationPaymentRepository.save(object);
    }

    @Override
    public void delete(VaccinationTransactionsPayments object) {
        vaccinationPaymentRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vaccinationPaymentRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(VaccinationTransactionsPayments object) {

    }
}
