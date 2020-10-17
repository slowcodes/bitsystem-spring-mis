package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class PatientVitalsCommand {
    private Long id;
    private Long patientId;
    private Double height;
    private String bloodPresure;
    private String pulseRate;
    private Double weight;
    private String bloodSugar;
    private Double tempreture;
    private LocalDateTime localDateTime;
}
