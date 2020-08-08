package ng.com.bitsystems.mis.repositories.inventory;

import ng.com.bitsystems.mis.models.inventory.InventoryBarcodes;
import org.springframework.data.repository.CrudRepository;

public interface InventoryBarcodeRepository extends CrudRepository<InventoryBarcodes, Long> {
}
