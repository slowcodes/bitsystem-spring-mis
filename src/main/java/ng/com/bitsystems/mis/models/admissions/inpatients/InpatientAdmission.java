package ng.com.bitsystems.mis.models.admissions.inpatients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.admissions.Admission;
import ng.com.bitsystems.mis.models.admissions.facilities.StartUsage;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InpatientAdmission extends Admission {

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "inpatientAdmission")
     private Set<InpatientPrescriptions> inpatientPrescriptions = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "inpatientAdmission")
     private Set<StartUsage> startUsages = new HashSet<>();

    public InpatientAdmission addFacilityUsage(StartUsage startUsage) {
        this.startUsages.add(startUsage);
        startUsage.setInpatientAdmission(this);
        return this;
    }
}


