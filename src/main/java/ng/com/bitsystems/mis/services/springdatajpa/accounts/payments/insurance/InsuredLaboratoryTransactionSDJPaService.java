package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredLaboratoryTransactions;
import ng.com.bitsystems.mis.repositories.accounts.payments.insurance.InsuredLaboratoryTransactionRepository;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.InsuredLaboratoryTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InsuredLaboratoryTransactionSDJPaService implements InsuredLaboratoryTransactionService {
    private InsuredLaboratoryTransactionRepository laboratoryTransactionRepository;

    public InsuredLaboratoryTransactionSDJPaService(InsuredLaboratoryTransactionRepository laboratoryTransactionRepository) {
        this.laboratoryTransactionRepository = laboratoryTransactionRepository;
    }

    @Override
    public Set<InsuredLaboratoryTransactions> findAll() {
        Set<InsuredLaboratoryTransactions> insuredLaboratoryTransactions = new HashSet<>();
        laboratoryTransactionRepository.findAll().forEach(insuredLaboratoryTransactions::add);
        return insuredLaboratoryTransactions;
    }

    @Override
    public InsuredLaboratoryTransactions findByID(Long aLong) {
        return laboratoryTransactionRepository.findById(aLong).get();
    }

    @Override
    public InsuredLaboratoryTransactions add(InsuredLaboratoryTransactions object) {
        return laboratoryTransactionRepository.save(object);
    }

    @Override
    public void delete(InsuredLaboratoryTransactions object) {
        laboratoryTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        laboratoryTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InsuredLaboratoryTransactions object) {

    }
}
