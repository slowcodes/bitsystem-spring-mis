package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryGroupCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryGroups;
import org.springframework.core.convert.converter.Converter;

public class InventoryGroupCommandToInventoryGroup implements Converter<InventoryGroupCommand, InventoryGroups> {
    @Override
    public InventoryGroups convert(InventoryGroupCommand source) {
        return null;
    }
}
