package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryPerLaboratoryTransactionCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryPerLaboratoryTransaction;
import org.springframework.core.convert.converter.Converter;

public class InventoryPerLabTxnCommandToInventoryPerLabTxn
implements Converter<InventoryPerLaboratoryTransactionCommand, InventoryPerLaboratoryTransaction> {
    @Override
    public InventoryPerLaboratoryTransaction convert(InventoryPerLaboratoryTransactionCommand source) {
        return null;
    }
}
