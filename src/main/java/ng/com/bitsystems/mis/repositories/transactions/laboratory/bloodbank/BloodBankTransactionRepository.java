package ng.com.bitsystems.mis.repositories.transactions.laboratory.bloodbank;

import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import org.springframework.data.repository.CrudRepository;

public interface BloodBankTransactionRepository extends CrudRepository<BloodbankTransaction, Long> {
}
