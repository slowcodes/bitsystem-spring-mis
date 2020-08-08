package ng.com.bitsystems.mis.repositories.transactions.laboratory;

import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import org.springframework.data.repository.CrudRepository;

public interface LaboratoryTransactionDetailsRepository  extends CrudRepository<LaboratoryTransactionDetail, Long> {
}
