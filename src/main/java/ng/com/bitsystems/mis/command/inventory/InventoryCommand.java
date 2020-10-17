package ng.com.bitsystems.mis.command.inventory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class InventoryCommand {
    private Long id;
    private Set<InventoryGroupCommand> inventoryGroupCommands = new HashSet<>();
    private ServicePriceCodeCommand servicePriceCodeCommand;
    private String name;
    private String itemDesc;
    private String measure;
    private int qtyAvl;
    private String itemType;
    private Set<InventoryBarcodeCommand> inventoryBarcodeCommand = new HashSet<>();
}
