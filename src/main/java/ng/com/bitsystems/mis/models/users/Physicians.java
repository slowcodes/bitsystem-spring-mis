package ng.com.bitsystems.mis.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmissionDischarged;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptions;
import ng.com.bitsystems.mis.models.consultation.Specializations;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Physicians extends Users {

    @ManyToMany
    private Set<Specializations> specializations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<OutpatientAdmissionDischarged> outpatientAdmissionDischargeds = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<OutpatientAdmission> outpatientAdmissions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<OutpatientPrescriptions> outpatientPrescriptions=new HashSet<>();

    public Physicians addClosedOutpatientCase(OutpatientAdmissionDischarged outpatient) {
        this.outpatientAdmissionDischargeds.add(outpatient);
        outpatient.setUsers(this);
        return this;
    }

    public Physicians addAdmittedOutpatients(OutpatientAdmission outpatientAdmission) {
        this.outpatientAdmissions.add(outpatientAdmission);
        outpatientAdmission.setUsers(this);
        return this;
    }

    public Physicians addOutPatientPrecription(OutpatientPrescriptions outpatientPrescriptions) {
        this.outpatientPrescriptions.add(outpatientPrescriptions);
        outpatientPrescriptions.setUsers(this);
        return this;
    }
}
