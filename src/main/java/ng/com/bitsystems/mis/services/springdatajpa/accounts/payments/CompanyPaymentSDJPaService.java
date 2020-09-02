package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.CompanyPayments;
import ng.com.bitsystems.mis.repositories.accounts.payments.CompanyPaymentsRepository;
import ng.com.bitsystems.mis.services.accounts.payments.CompanyPaymentService;

import java.util.HashSet;
import java.util.Set;

public class CompanyPaymentSDJPaService implements CompanyPaymentService {
    private CompanyPaymentsRepository companyPaymentsRepository;

    public CompanyPaymentSDJPaService(CompanyPaymentsRepository companyPaymentsRepository) {
        this.companyPaymentsRepository = companyPaymentsRepository;
    }

    @Override
    public Set<CompanyPayments> findAll() {
        Set<CompanyPayments> companyPayments = new HashSet<>();
        companyPaymentsRepository.findAll().forEach(companyPayments::add);
        return companyPayments;
    }

    @Override
    public CompanyPayments findByID(Long aLong) {
        return companyPaymentsRepository.findById(aLong).get();
    }

    @Override
    public CompanyPayments add(CompanyPayments object) {
        return companyPaymentsRepository.save(object);
    }

    @Override
    public void delete(CompanyPayments object) {
        companyPaymentsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        companyPaymentsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(CompanyPayments object) {

    }
}
