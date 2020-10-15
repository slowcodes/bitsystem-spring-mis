package ng.com.bitsystems.mis.services.springdatajpa.inventory;

import ng.com.bitsystems.mis.models.inventory.InventoryBarcodes;
import ng.com.bitsystems.mis.repositories.inventory.InventoryBarcodeRepository;
import ng.com.bitsystems.mis.services.inventory.InventoryBarcodeServices;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InventoryBarcodeSDJPaService implements InventoryBarcodeServices {
    private InventoryBarcodeRepository inventoryBarcodeRepository;
    @Override
    public Set<InventoryBarcodes> findAll() {
        Set<InventoryBarcodes> inventoryBarcodes = new HashSet<>();
        inventoryBarcodeRepository.findAll().forEach(inventoryBarcodes::add);
        return inventoryBarcodes;
    }

    @Override
    public InventoryBarcodes findByID(Long aLong) {
        return inventoryBarcodeRepository.findById(aLong).get();
    }

    @Override
    public InventoryBarcodes add(InventoryBarcodes object) {
        return inventoryBarcodeRepository.save(object);
    }

    @Override
    public void delete(InventoryBarcodes object) {
        inventoryBarcodeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        inventoryBarcodeRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InventoryBarcodes object) {

    }
}
