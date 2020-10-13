package ng.com.bitsystems.mis.services.springdatajpa.transactions.laboratory;

import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.repositories.transactions.laboratory.LaboratoryTransactionRepository;
import ng.com.bitsystems.mis.services.transactions.laboratory.LaboratoryTransactionService;

import java.util.HashSet;
import java.util.Set;

public class LaboratoryTransactionSDJPaService implements LaboratoryTransactionService {
    private LaboratoryTransactionRepository laboratoryTransactionRepository;

    public LaboratoryTransactionSDJPaService(LaboratoryTransactionRepository laboratoryTransactionRepository) {
        this.laboratoryTransactionRepository = laboratoryTransactionRepository;
    }

    @Override
    public Set<LaboratoryTransaction> findAll() {
        Set<LaboratoryTransaction> laboratoryTransactions = new HashSet<>();
        laboratoryTransactionRepository.findAll().forEach(laboratoryTransactions::add);
        return laboratoryTransactions;
    }

    @Override
    public LaboratoryTransaction findByID(Long aLong) {
        return laboratoryTransactionRepository.findById(aLong).get();
    }

    @Override
    public LaboratoryTransaction add(LaboratoryTransaction object) {
        return laboratoryTransactionRepository.save(object);
    }

    @Override
    public void delete(LaboratoryTransaction object) {
        laboratoryTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        laboratoryTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(LaboratoryTransaction object) {

    }
}
