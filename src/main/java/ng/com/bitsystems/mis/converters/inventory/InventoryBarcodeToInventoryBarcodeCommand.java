package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryBarcodeCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryBarcodes;
import org.springframework.core.convert.converter.Converter;

public class InventoryBarcodeToInventoryBarcodeCommand implements Converter<InventoryBarcodes, InventoryBarcodeCommand> {
    @Override
    public InventoryBarcodeCommand convert(InventoryBarcodes source) {
        return null;
    }
}
