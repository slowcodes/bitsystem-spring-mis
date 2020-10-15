package ng.com.bitsystems.mis.services.springdatajpa.inventory;

import ng.com.bitsystems.mis.models.inventory.InventoryPerLaboratoryTransaction;
import ng.com.bitsystems.mis.repositories.inventory.InventoryPerLabTransactionRepository;
import ng.com.bitsystems.mis.services.inventory.InventoryPerLabTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InventoryPerLabTransactionSDJPaService implements InventoryPerLabTransactionService {
    private InventoryPerLabTransactionRepository inventoryPerLabTransactionRepository;

    public InventoryPerLabTransactionSDJPaService(InventoryPerLabTransactionRepository inventoryPerLabTransactionRepository) {
        this.inventoryPerLabTransactionRepository = inventoryPerLabTransactionRepository;
    }

    @Override
    public Set<InventoryPerLaboratoryTransaction> findAll() {
        Set<InventoryPerLaboratoryTransaction> inventoryPerLaboratoryTransactions = new HashSet<>();
        inventoryPerLabTransactionRepository.findAll().forEach(inventoryPerLaboratoryTransactions::add);
        return inventoryPerLaboratoryTransactions;
    }

    @Override
    public InventoryPerLaboratoryTransaction findByID(Long aLong) {
        return inventoryPerLabTransactionRepository.findById(aLong).get();
    }

    @Override
    public InventoryPerLaboratoryTransaction add(InventoryPerLaboratoryTransaction object) {
        return inventoryPerLabTransactionRepository.save(object);
    }

    @Override
    public void delete(InventoryPerLaboratoryTransaction object) {
        inventoryPerLabTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        inventoryPerLabTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InventoryPerLaboratoryTransaction object) {

    }
}
