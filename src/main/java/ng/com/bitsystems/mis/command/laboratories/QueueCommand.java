package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.laboratories.QueueStatus;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class QueueCommand {
    private Long id;
    private Long laboratoryTransactionDetailId;
    private LocalDateTime requestTime;
    private QueueStatus queueStatus;
}
