package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class IssueLogCommand {
    private Long id;
    private Long storageId;
    private Long patientId;
    private Long userId;
    private LocalDate issueDate;
}
