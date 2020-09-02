package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredOtherServices;
import ng.com.bitsystems.mis.repositories.accounts.payments.insurance.InsuredOtherServiceRepository;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.InsuredOtherServiceTransactionService;

import java.util.HashSet;
import java.util.Set;

public class InsuredOtherServiceTransactionSDJPaService implements InsuredOtherServiceTransactionService {
    private InsuredOtherServiceRepository otherServiceRepository;

    public InsuredOtherServiceTransactionSDJPaService(InsuredOtherServiceRepository otherServiceRepository) {
        this.otherServiceRepository = otherServiceRepository;
    }

    @Override
    public Set<InsuredOtherServices> findAll() {
        Set<InsuredOtherServices> insuredOtherServices = new HashSet<>();
        otherServiceRepository.findAll().forEach(insuredOtherServices::add);
        return insuredOtherServices;
    }

    @Override
    public InsuredOtherServices findByID(Long aLong) {
        return otherServiceRepository.findById(aLong).get();
    }

    @Override
    public InsuredOtherServices add(InsuredOtherServices object) {
        return otherServiceRepository.save(object);
    }

    @Override
    public void delete(InsuredOtherServices object) {
        otherServiceRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        otherServiceRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InsuredOtherServices object) {

    }
}
