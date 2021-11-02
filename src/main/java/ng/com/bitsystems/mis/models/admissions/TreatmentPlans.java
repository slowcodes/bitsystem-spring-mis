package ng.com.bitsystems.mis.models.admissions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TreatmentPlans extends BaseEntity {
    private String treatment;
    private Integer duration; //days
    private Integer minAge;
    private Integer maxAge;

    @OneToOne
    private ServicePriceCode servicePriceCode;

    @ManyToMany
    @JoinTable(name = "treatment_plan_subscription",
            joinColumns = @JoinColumn(name = "treatment_id"),
            inverseJoinColumns = @JoinColumn(name = "disease_id"))
    private Set<DiseaseDirectory> diseaseDirectory = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "treatment_plan_prescriptions",
            joinColumns = @JoinColumn(name = "treatment_id"),
            inverseJoinColumns = @JoinColumn(name = "prescription_id"))
    private Set<Prescription> prescriptions = new HashSet<>();
}
