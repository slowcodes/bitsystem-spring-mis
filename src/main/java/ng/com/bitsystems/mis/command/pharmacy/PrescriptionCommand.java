package ng.com.bitsystems.mis.command.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.Form;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionCommand {
    private Long id;
    private PharmacyProductCommand pharmacyProductCommand;
    private Long userId;
    private Form form;
    private String administrationMode;
    private int duration;
    private int frequency;
    private int dose;
    private String measure;
    private Set<PrescriptionScheduleCommand> prescriptionScheduleCommands = new HashSet<>();
}
