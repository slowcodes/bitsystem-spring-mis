package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryBarcodeCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryBarcodes;
import org.springframework.core.convert.converter.Converter;

public class InventoryBarcodeToInventoryBarcodeCommand implements Converter<InventoryBarcodes, InventoryBarcodeCommand> {
    @Override
    public InventoryBarcodeCommand convert(InventoryBarcodes source) {
        if(source==null){
            return null;
        }
        final InventoryBarcodeCommand inventoryBarcodeCommand=new InventoryBarcodeCommand();
        inventoryBarcodeCommand.setBarcode(source.getBarcode());
        inventoryBarcodeCommand.setId(source.getId());
        if(source.getInventory()!=null)
            inventoryBarcodeCommand.setInventoryId(source.getInventory().getId());

        return inventoryBarcodeCommand;
    }
}
