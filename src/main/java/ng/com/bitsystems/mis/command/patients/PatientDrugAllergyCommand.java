package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PatientDrugAllergyCommand {
    private Long id;
    private Long patientId;
    private Long pharmacyProductsId;
    private Integer toleranceLevel; //On a scale of 0-10: O cannot tolerate
}
