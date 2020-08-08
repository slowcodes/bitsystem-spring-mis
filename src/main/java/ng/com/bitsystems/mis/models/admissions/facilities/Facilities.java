package ng.com.bitsystems.mis.models.admissions.facilities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.Rate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Facilities extends BaseEntity {
    private String locationDescription;

    @ManyToOne
    @JoinColumn(name = "facilityTypes_id")
    private FacilityTypes facilityTypes;

    @ManyToOne
    @JoinColumn(name = "typeCategory_id")
    private FacilityTypeCategory facilityTypeCategory;

    @OneToOne
    private Rate rate;

    @ManyToOne
    @JoinColumn(name = "wards_id")
    private Wards ward;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facilities")
    private Set<StartUsage> startUsage = new HashSet<>();
}
