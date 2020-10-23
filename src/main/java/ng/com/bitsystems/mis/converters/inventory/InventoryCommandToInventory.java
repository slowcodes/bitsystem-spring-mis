package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryCommand;
import ng.com.bitsystems.mis.models.inventory.Inventory;
import org.springframework.core.convert.converter.Converter;

public class InventoryCommandToInventory implements Converter<InventoryCommand, Inventory> {
    @Override
    public Inventory convert(InventoryCommand source) {
        return null;
    }
}
