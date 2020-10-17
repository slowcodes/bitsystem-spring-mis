package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LaboratoryInvestigationParameterCommand {
    private Long id;
    private ExperimentReadingCommand experimentReadingCommand;
    private String variableName;
    private String value;
}
