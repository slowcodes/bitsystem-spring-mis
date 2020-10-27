package ng.com.bitsystems.mis.models.admissions.facilities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StartUsage extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "facilities_id")
    private Facilities facilities;

    @ManyToOne
    @JoinColumn(name = "inpatientAdmission_id")
    private InpatientAdmission inpatientAdmission;

    private LocalDateTime startTime;

}
