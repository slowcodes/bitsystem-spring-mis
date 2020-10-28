package ng.com.bitsystems.mis.models.admissions.inpatients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PrescriptionSchedule;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InpatientPrescriptionSchedule  extends PrescriptionSchedule {

    @OneToOne
    private InpatientPrescriptions inpatientPrescriptions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inpatientPrescription")
    private Set<InpatientPrescriptionGeneratedAdministration> generatedAdministrations = new HashSet<>();

    public InpatientPrescriptionSchedule addGeneratedAdmin(InpatientPrescriptionGeneratedAdministration generatedAdministration) {
        this.generatedAdministrations.add(generatedAdministration);
        generatedAdministration.setSchedule(this);
        return this;
    }
}


