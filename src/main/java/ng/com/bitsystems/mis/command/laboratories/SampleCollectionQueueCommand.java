package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionDetailCommand;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class SampleCollectionQueueCommand {
    private Long id;
    private LaboratoryTransactionDetailCommand laboratoryTransactionDetailCommand;
    private PackageCommand packageCommand;
    private LocalDate requestTime;
    private Integer collectionStatus;
}
