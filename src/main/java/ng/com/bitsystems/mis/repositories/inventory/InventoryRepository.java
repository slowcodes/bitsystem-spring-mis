package ng.com.bitsystems.mis.repositories.inventory;

import ng.com.bitsystems.mis.models.inventory.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {
}
