package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryPerLaboratoryTransactionCommand;
import ng.com.bitsystems.mis.models.inventory.Inventory;
import ng.com.bitsystems.mis.models.inventory.InventoryPerLaboratoryTransaction;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import org.springframework.core.convert.converter.Converter;

public class InventoryPerLabTxnCommandToInventoryPerLabTxn
implements Converter<InventoryPerLaboratoryTransactionCommand, InventoryPerLaboratoryTransaction> {

    private InventoryCommandToInventory inventoryCommandToInventory;

    @Override
    public InventoryPerLaboratoryTransaction convert(InventoryPerLaboratoryTransactionCommand source) {
        if(source==null){
            return null;
        }
        final InventoryPerLaboratoryTransaction inventoryPerLaboratoryTransaction=new InventoryPerLaboratoryTransaction();
        inventoryPerLaboratoryTransaction.setId(source.getId());
        if(source.getInventoryId()!=null){
            Inventory inventory = new Inventory();
            inventory.setId(source.getInventoryId());
            inventoryPerLaboratoryTransaction.setInventory(inventory);
            Inventory inventory1 = inventory.addInventoryPerTransaction(inventoryPerLaboratoryTransaction);
        }
        inventoryPerLaboratoryTransaction.setRequiredQty(source.getRequiredQty());

        if(source.getLaboratoryInvestigationsId()!=null){
            LaboratoryInvestigations laboratoryInvestigations=new LaboratoryInvestigations();
            laboratoryInvestigations.setId(source.getLaboratoryInvestigationsId());
            inventoryPerLaboratoryTransaction.setLaboratoryInvestigations(laboratoryInvestigations);
            LaboratoryInvestigations investigations=laboratoryInvestigations.addInvPerLabTxn(inventoryPerLaboratoryTransaction);
        }
        return inventoryPerLaboratoryTransaction;
    }
}
