package ng.com.bitsystems.mis.services.transactions.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.services.CrudService;

public interface LaboratoryTransactionService extends CrudService<LaboratoryTransaction, Long> {
    LaboratoryTransaction add(LaboratoryTransactionCommand laboratoryTransactionCommand);
}
