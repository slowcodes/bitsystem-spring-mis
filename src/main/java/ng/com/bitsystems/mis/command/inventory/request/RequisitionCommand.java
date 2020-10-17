package ng.com.bitsystems.mis.command.inventory.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class RequisitionCommand {
    private Long id;
    private Long users_id;
    private LocalDate dateOfRequisition;
    private Set<RequisitionDetailCommand> requisitionDetailCommands = new HashSet<>();
}
