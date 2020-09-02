package ng.com.bitsystems.mis.repositories.inventory;

import ng.com.bitsystems.mis.models.inventory.InventoryPerLaboratoryTransaction;
import org.springframework.data.repository.CrudRepository;

public interface InventoryPerLabTransactionRepository extends CrudRepository<InventoryPerLaboratoryTransaction, Long> {
}
