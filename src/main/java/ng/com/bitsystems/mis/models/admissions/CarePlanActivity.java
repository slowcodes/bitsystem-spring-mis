package ng.com.bitsystems.mis.models.admissions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CarePlanActivity extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "carePlanId")
    private CarePlans carePlan;

    private Integer dayNo;
    private String activityDescription;

}
