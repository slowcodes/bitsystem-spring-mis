package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryBarcodeCommand;
import ng.com.bitsystems.mis.models.inventory.Inventory;
import ng.com.bitsystems.mis.models.inventory.InventoryBarcodes;
import org.springframework.core.convert.converter.Converter;

public class InventoryBarcodeCommandToInventoryBarcode
implements Converter<InventoryBarcodeCommand, InventoryBarcodes> {
    @Override
    public InventoryBarcodes convert(InventoryBarcodeCommand source) {
        if(source==null){
            return null;
        }

        final InventoryBarcodes inventoryBarcodes=new InventoryBarcodes();
        inventoryBarcodes.setBarcode(source.getBarcode());
        inventoryBarcodes.setId(source.getId());

        if(source.getInventoryId()!=null){
            Inventory inventory = new Inventory();
            inventory.setId(source.getInventoryId());
            inventoryBarcodes.setInventory(inventory);
            Inventory inv = inventory.addBarcodes(inventoryBarcodes);
        }

        return inventoryBarcodes;
    }
}
