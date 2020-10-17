package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class LaboratoriesCommand {
    private Long id;
    private String labName;
    private String description;
    private Set<InvestigationGroupCommand> investigationGroupCommand = new HashSet<>();
}
