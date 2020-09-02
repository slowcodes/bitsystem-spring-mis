package ng.com.bitsystems.mis.services.springdatajpa.inventory;

import ng.com.bitsystems.mis.models.inventory.Inventory;
import ng.com.bitsystems.mis.repositories.inventory.InventoryRepository;
import ng.com.bitsystems.mis.services.inventory.InventoryService;

import java.util.HashSet;
import java.util.Set;

public class InventorySDJPaService implements InventoryService {
    private InventoryRepository inventoryRepository;

    public InventorySDJPaService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public Set<Inventory> findAll() {
        Set<Inventory> inventories = new HashSet<>();
        inventoryRepository.findAll().forEach(inventories::add);
        return inventories;
    }

    @Override
    public Inventory findByID(Long aLong) {
        return inventoryRepository.findById(aLong).get();
    }

    @Override
    public Inventory add(Inventory object) {
        return inventoryRepository.save(object);
    }

    @Override
    public void delete(Inventory object) {
        inventoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        inventoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Inventory object) {

    }
}
