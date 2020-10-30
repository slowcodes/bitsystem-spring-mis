package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeCommandToSalesPriceCode;
import ng.com.bitsystems.mis.models.inventory.Inventory;
import org.springframework.core.convert.converter.Converter;

public class InventoryCommandToInventory implements Converter<InventoryCommand, Inventory> {

    private InventoryBarcodeCommandToInventoryBarcode inventoryBarcodeCommandToInventoryBarcode;
    private InventoryGroupCommandToInventoryGroup inventoryGroupCommandToInventoryGroup;
    private SalesPriceCodeCommandToSalesPriceCode servicePriceCodeCommandToServicePriceCode;

    public InventoryCommandToInventory(InventoryBarcodeCommandToInventoryBarcode inventoryBarcodeCommandToInventoryBarcode, InventoryGroupCommandToInventoryGroup inventoryGroupCommandToInventoryGroup, SalesPriceCodeCommandToSalesPriceCode servicePriceCodeCommandToServicePriceCode) {
        this.inventoryBarcodeCommandToInventoryBarcode = inventoryBarcodeCommandToInventoryBarcode;
        this.inventoryGroupCommandToInventoryGroup = inventoryGroupCommandToInventoryGroup;
        this.servicePriceCodeCommandToServicePriceCode = servicePriceCodeCommandToServicePriceCode;
    }

    @Override
    public Inventory convert(InventoryCommand source) {

        if(source==null){
            return null;
        }

        final Inventory inventory=new Inventory();
        inventory.setId(source.getId());

        if(source.getInventoryBarcodeCommand()!=null && source.getInventoryBarcodeCommand().size()>0){
            source.getInventoryBarcodeCommand().forEach(inventoryBarcodeCommand -> inventory.getInventoryBarcodes().add(inventoryBarcodeCommandToInventoryBarcode.convert(inventoryBarcodeCommand)));
        }

        if(source.getInventoryGroupCommands() !=null && source.getInventoryGroupCommands().size()>0)
            source.getInventoryGroupCommands().forEach(inventoryGroupCommand -> inventory.getInventoryGroups().add(inventoryGroupCommandToInventoryGroup.convert(inventoryGroupCommand)));

        inventory.setItemDesc(source.getItemDesc());
        inventory.setItemType(source.getItemType());
        inventory.setMeasure(source.getMeasure());
        inventory.setName(source.getName());
        inventory.setQtyAvl(source.getQtyAvl());
        inventory.setSalesPriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getSalesPriceCodeCommand()));


        return inventory;
    }
}
