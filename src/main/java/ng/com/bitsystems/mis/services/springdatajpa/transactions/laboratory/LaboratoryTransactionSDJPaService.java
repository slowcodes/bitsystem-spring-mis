package ng.com.bitsystems.mis.services.springdatajpa.transactions.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnCommandToLabTxn;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.repositories.transactions.laboratory.LaboratoryTransactionRepository;
import ng.com.bitsystems.mis.services.transactions.laboratory.LaboratoryTransactionService;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class LaboratoryTransactionSDJPaService implements LaboratoryTransactionService {
    private LaboratoryTransactionRepository laboratoryTransactionRepository;
    private LabTxnCommandToLabTxn labTxnCommandToLabTxn;

    public LaboratoryTransactionSDJPaService(LaboratoryTransactionRepository laboratoryTransactionRepository,
                                             LabTxnCommandToLabTxn labTxnCommandToLabTxn) {
        this.laboratoryTransactionRepository = laboratoryTransactionRepository;
        this.labTxnCommandToLabTxn = labTxnCommandToLabTxn;
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
    public LaboratoryTransaction add(LaboratoryTransactionCommand object) {
        LaboratoryTransaction lab = labTxnCommandToLabTxn.convert(object);
        return laboratoryTransactionRepository.save(lab);
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
