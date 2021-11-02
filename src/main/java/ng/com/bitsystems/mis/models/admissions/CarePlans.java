package ng.com.bitsystems.mis.models.admissions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CarePlans extends BaseEntity {

    private String plan;
    private Integer days;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carePlan")
    private Set<CarePlanActivity> carePlanActivities = new HashSet<>();

    @OneToOne
    private ServicePriceCode servicePriceCode;

    @ManyToMany
    @JoinTable(name = "care_plan_ailments",
            joinColumns = @JoinColumn(name = "care_plan_id"),
            inverseJoinColumns = @JoinColumn(name = "disease_id"))
    private Set<DiseaseDirectory> diseaseDirectory = new HashSet<>();
}
