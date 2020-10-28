package ng.com.bitsystems.mis.command.admissions.inpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class InpatientPrescriptionGeneratedAdministrationCommand {
    private Long id;
    private PharmacyProductCommand pharmacyProductCommand;
    private Long prescriptionScheduleCommandId;
    private LocalDateTime estimatedAdminTime;
}