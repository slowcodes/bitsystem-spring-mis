package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class InvestigationGroupCommand {
    private Long id;
    private LaboratoriesCommand laboratory;
    private String grpName;
    private Set<LaboratoryInvestigationCommand> laboratoryInvestigationCommands;
}
