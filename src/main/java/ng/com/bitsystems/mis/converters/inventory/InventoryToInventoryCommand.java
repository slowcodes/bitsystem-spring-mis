package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeToSalesPriceCodeCommand;
import ng.com.bitsystems.mis.models.inventory.Inventory;
import org.springframework.core.convert.converter.Converter;

public class InventoryToInventoryCommand implements Converter<Inventory, InventoryCommand> {
    private InventoryGroupToInventoryGroupCommand inventoryGroupToInventoryGroupCommand;
    private InventoryBarcodeToInventoryBarcodeCommand inventoryBarcodeToInventoryBarcodeCommand;
    private SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand;

    public InventoryToInventoryCommand(InventoryGroupToInventoryGroupCommand inventoryGroupToInventoryGroupCommand, InventoryBarcodeToInventoryBarcodeCommand inventoryBarcodeToInventoryBarcodeCommand,
                                       SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand) {
        this.inventoryGroupToInventoryGroupCommand = inventoryGroupToInventoryGroupCommand;
        this.inventoryBarcodeToInventoryBarcodeCommand = inventoryBarcodeToInventoryBarcodeCommand;
        this.salesPriceCodeToSalesPriceCodeCommand = salesPriceCodeToSalesPriceCodeCommand;
    }

    @Override
    public InventoryCommand convert(Inventory source) {
        if(source==null){
            return null;
        }

        final InventoryCommand inventoryCommand = new InventoryCommand();
        inventoryCommand.setId(source.getId());
        if (source.getInventoryGroups().size()>0 && source.getInventoryGroups()!=null)
            source.getInventoryGroups().forEach(inventoryGroups -> inventoryCommand.getInventoryGroupCommands().add(inventoryGroupToInventoryGroupCommand.convert(inventoryGroups)));
        if (source.getInventoryBarcodes().size()>0 && source.getInventoryBarcodes()!=null)
            source.getInventoryBarcodes().forEach(inventoryBarcodes -> inventoryCommand.getInventoryBarcodeCommand().add(inventoryBarcodeToInventoryBarcodeCommand.convert(inventoryBarcodes)));
        inventoryCommand.setItemDesc(source.getItemDesc());
        inventoryCommand.setItemType(source.getItemType());
        inventoryCommand.setMeasure(source.getMeasure());
        inventoryCommand.setName(source.getName());
        inventoryCommand.setQtyAvl(source.getQtyAvl());
        inventoryCommand.setSalesPriceCodeCommand(salesPriceCodeToSalesPriceCodeCommand.convert(source.getSalesPriceCode()));

        return inventoryCommand;
    }
}
