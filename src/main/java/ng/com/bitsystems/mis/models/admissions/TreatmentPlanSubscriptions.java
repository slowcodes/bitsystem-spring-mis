package ng.com.bitsystems.mis.models.admissions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TreatmentPlanSubscriptions extends BaseService {
    @ManyToOne
    @JoinColumn(name = "treatmentId")
    private TreatmentPlans treatmentPlans;

}
