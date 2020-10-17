package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionDetailCommand;

@Setter
@Getter
@NoArgsConstructor
public class ExperimentReadingCommand {
    private Long id;
    private ExperimentParametersCommand experimentParametersCommand;
    private LaboratoryTransactionDetailCommand laboratoryTransactionDetailCommand;
    private String valueOfParameter;
    private String color;
    private Long collectedSamplesId;
}
