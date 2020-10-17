package ng.com.bitsystems.mis.command.admissions.outpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;
import ng.com.bitsystems.mis.models.pharmacy.Form;

@Setter
@Getter
@NoArgsConstructor
public class OutpatientPrescriptionCommand {
    private Long id;
    private Long usersId;
    private Form form;
    private String administrationMode;
    private Long duration;
    private Integer frequency;
    private Integer dose;
    private String measure;
    private PharmacyProductCommand pharmacyProductCommand;
}
