package ng.com.bitsystems.mis.models.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PrescriptionSchedule extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "users_id")
    private AppUsers appUsers;

    private String prescriptionNote;

    private int noOfDosage;

    private Integer hourlyInterval;

    private Integer timeOfSchedule;

    @ManyToOne
    @JoinColumn(name = "prescriptionId")
    private Prescription prescription;
}
