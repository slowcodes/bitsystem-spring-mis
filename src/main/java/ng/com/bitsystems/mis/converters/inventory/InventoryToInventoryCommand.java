package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryCommand;
import ng.com.bitsystems.mis.models.inventory.Inventory;
import org.springframework.core.convert.converter.Converter;

public class InventoryToInventoryCommand implements Converter<Inventory, InventoryCommand> {
    @Override
    public InventoryCommand convert(Inventory source) {
        return null;
    }
}
