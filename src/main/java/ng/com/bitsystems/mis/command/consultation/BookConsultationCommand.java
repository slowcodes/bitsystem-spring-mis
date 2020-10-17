package ng.com.bitsystems.mis.command.consultation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class BookConsultationCommand {

    private Long id;
    private Long patientId;
    private Long userId;
    private SpecializationCommand specializationCommand;
    private LocalDate createdAt;
    private LocalDate bookedConsultationDay;

}
