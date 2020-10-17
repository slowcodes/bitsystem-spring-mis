package ng.com.bitsystems.mis.command.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class PrescriptionAdministrationCommand {
    private Long id;
    private Long userId;
    private LocalDateTime administrationTime;
    private String comment;
}
