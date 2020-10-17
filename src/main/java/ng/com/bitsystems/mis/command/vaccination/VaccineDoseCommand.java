package ng.com.bitsystems.mis.command.vaccination;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;
import ng.com.bitsystems.mis.models.vaccination.VaccineSchedule;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class VaccineDoseCommand {
    private Long id;
    private PharmacyProductCommand pharmacyProductCommand;
    private LocalDateTime extimatedAdminTime;
    private VaccineSchedule vaccineSchedule;
}
