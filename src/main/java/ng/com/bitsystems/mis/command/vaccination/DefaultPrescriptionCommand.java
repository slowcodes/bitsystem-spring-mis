package ng.com.bitsystems.mis.command.vaccination;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class DefaultPrescriptionCommand {
    private Long id;
    private PharmacyProductCommand pharmacyProductCommand;
    private LocalDateTime extimatedAdminTime;
}
