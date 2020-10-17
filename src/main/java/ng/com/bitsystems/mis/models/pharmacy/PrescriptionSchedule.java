package ng.com.bitsystems.mis.models.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class PrescriptionSchedule extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;
    private String prescriptionNote;
    private int noOfDosage;
    private Integer hourlyInterval;
    private Integer timeOfSchedule;

}
