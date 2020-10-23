package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryPerLaboratoryTransactionCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryPerLaboratoryTransaction;
import org.springframework.core.convert.converter.Converter;

public class InventoryPerLabTxnToInventoryPerLabTxnCommand
implements Converter<InventoryPerLaboratoryTransaction, InventoryPerLaboratoryTransactionCommand> {
    @Override
    public InventoryPerLaboratoryTransactionCommand convert(InventoryPerLaboratoryTransaction source) {
        return null;
    }
}
