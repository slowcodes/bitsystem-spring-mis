package ng.com.bitsystems.mis.command.inventory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class InventoryCommand {
    private Long id;
    private Set<InventoryGroupCommand> inventoryGroupCommands = new HashSet<>();
    private SalesPriceCodeCommand salesPriceCodeCommand;
    private String name;
    private String itemDesc;
    private String measure;
    private int qtyAvl;
    private String itemType;
    private Set<InventoryBarcodeCommand> inventoryBarcodeCommand = new HashSet<>();
}
