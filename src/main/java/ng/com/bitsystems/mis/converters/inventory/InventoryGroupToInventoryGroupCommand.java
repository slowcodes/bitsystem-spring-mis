package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryGroupCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryGroups;
import org.springframework.core.convert.converter.Converter;

public class InventoryGroupToInventoryGroupCommand implements Converter<InventoryGroups, InventoryGroupCommand> {
    @Override
    public InventoryGroupCommand convert(InventoryGroups source) {
        return null;
    }
}
