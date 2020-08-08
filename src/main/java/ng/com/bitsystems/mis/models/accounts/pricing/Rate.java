package ng.com.bitsystems.mis.models.accounts.pricing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypes;
import ng.com.bitsystems.mis.models.admissions.facilities.Wards;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rate extends BaseEntity {

    @Column(name = "rate_type")
    @Enumerated(value = EnumType.STRING)
    private RateTypes rateTypes;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "service_description")
    private String service_description;

    @OneToOne
    private FacilityTypes facilityTypes;

    @OneToOne
    private Wards wards;

}
