package ng.com.bitsystems.mis.command.admissions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class DischargeCommand {
    private Long id;
    private Long userId;
    private LocalDate dateDischarged;
    private LocalDateTime timeOfdischarge;
    private String comment;
    private AdmissionCommand admissionCommand;
}
