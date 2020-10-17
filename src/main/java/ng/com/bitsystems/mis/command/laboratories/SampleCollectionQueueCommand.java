package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class SampleCollectionQueueCommand {
    private Long id;
    private Long laboratoryTransactionDetailId;
    private Long laboratoryPackageDetailsId;
    private LocalDate requestTime;
    private Integer collectionStatus;
}
