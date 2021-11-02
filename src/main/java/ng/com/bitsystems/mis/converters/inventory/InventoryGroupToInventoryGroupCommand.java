package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryGroupCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryGroups;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InventoryGroupToInventoryGroupCommand implements Converter<InventoryGroups, InventoryGroupCommand> {
    @Override
    public InventoryGroupCommand convert(InventoryGroups source) {
        if(source==null){
            return null;
        }
        InventoryGroupCommand inventoryGroupCommand = new InventoryGroupCommand();
        inventoryGroupCommand.setGroupDesc(source.getGroupDesc());
        inventoryGroupCommand.setGroupName(source.getGroupName());
        inventoryGroupCommand.setId(source.getId());
        return inventoryGroupCommand;
    }
}
