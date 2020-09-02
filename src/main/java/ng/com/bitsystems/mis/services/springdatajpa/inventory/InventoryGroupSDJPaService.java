package ng.com.bitsystems.mis.services.springdatajpa.inventory;

import ng.com.bitsystems.mis.models.inventory.InventoryGroups;
import ng.com.bitsystems.mis.repositories.inventory.InventoryGroupsRepository;
import ng.com.bitsystems.mis.services.inventory.InventoryGroupsService;

import java.util.HashSet;
import java.util.Set;

public class InventoryGroupSDJPaService implements InventoryGroupsService {
    private InventoryGroupsRepository inventoryGroupsRepository;

    public InventoryGroupSDJPaService(InventoryGroupsRepository inventoryGroupsRepository) {
        this.inventoryGroupsRepository = inventoryGroupsRepository;
    }

    @Override
    public Set<InventoryGroups> findAll() {
        Set<InventoryGroups> inventoryGroups = new HashSet<>();
        inventoryGroupsRepository.findAll().forEach(inventoryGroups::add);
        return inventoryGroups;
    }

    @Override
    public InventoryGroups findByID(Long aLong) {
        return inventoryGroupsRepository.findById(aLong).get();
    }

    @Override
    public InventoryGroups add(InventoryGroups object) {
        return inventoryGroupsRepository.save(object);
    }

    @Override
    public void delete(InventoryGroups object) {
        inventoryGroupsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        inventoryGroupsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InventoryGroups object) {

    }
}
