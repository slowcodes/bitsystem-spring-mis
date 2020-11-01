package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ExperimentReadingCommand {
    private Long id;
    private ExperimentParametersCommand experimentParametersCommand;
    private Long laboratoryTransactionDetailId;
    private String valueOfParameter;
    private String color;
    private Long collectedSamplesId;
}
