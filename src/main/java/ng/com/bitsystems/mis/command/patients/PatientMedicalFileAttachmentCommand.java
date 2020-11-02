package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PatientMedicalFileAttachmentCommand {
    private Long id;
    private Long patientId;
    private byte[] medicalFile;
    private String description;
    private Long userId;
}
