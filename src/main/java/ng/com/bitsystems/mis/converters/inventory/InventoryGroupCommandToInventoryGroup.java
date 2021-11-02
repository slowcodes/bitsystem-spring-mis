package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryGroupCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryGroups;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InventoryGroupCommandToInventoryGroup implements Converter<InventoryGroupCommand, InventoryGroups> {
    @Override
    public InventoryGroups convert(InventoryGroupCommand source) {
        if(source==null){
            return null;
        }

        InventoryGroups inventoryGroups = new InventoryGroups();

        inventoryGroups.setId(source.getId());
        inventoryGroups.setGroupDesc(inventoryGroups.getGroupDesc());
        inventoryGroups.setGroupName(inventoryGroups.getGroupName());

        return inventoryGroups;
    }
}
