package ng.com.bitsystems.mis.command.inventory.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.inventory.InventoryCommand;

@Setter
@Getter
@NoArgsConstructor
public class RequisitionDetailCommand {
    private Long id;
    private InventoryCommand inventoryCommand;
    private Long requisitionId;
    private Integer reqQty;
    private String reason;
    private Double estimatedCost;
    private String status;
}
