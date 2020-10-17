package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionDetailCommand;
import ng.com.bitsystems.mis.models.laboratories.SampleType;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class CollectedSamplesCommand {
    private Long id;
    private LaboratoryTransactionDetailCommand laboratoryTransactionDetailCommand;
    private Long userId;
    private SampleType sampleType;
    private Integer analysed;
    private LocalDate dateOfCollection;
    private Set<ExperimentReadingCommand> experimentReadingCommands = new HashSet<>();
}
