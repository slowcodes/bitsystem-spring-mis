package ng.com.bitsystems.mis.command.inventory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class InventoryPerLaboratoryTransactionCommand {
    private Long id;
    private Long inventoryId;
    private Long laboratoryInvestigationsId;
    private Integer requiredQty;
}
