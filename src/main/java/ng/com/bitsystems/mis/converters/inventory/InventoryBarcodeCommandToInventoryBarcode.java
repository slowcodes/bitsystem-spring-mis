package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryBarcodeCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryBarcodes;
import org.springframework.core.convert.converter.Converter;

public class InventoryBarcodeCommandToInventoryBarcode
implements Converter<InventoryBarcodeCommand, InventoryBarcodes> {
    @Override
    public InventoryBarcodes convert(InventoryBarcodeCommand source) {
        return null;
    }
}
