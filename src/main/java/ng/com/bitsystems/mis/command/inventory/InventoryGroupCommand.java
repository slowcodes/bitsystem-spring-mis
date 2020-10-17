package ng.com.bitsystems.mis.command.inventory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class InventoryGroupCommand {
    private Long id;
    private String groupName;
    private String groupDesc;
}
