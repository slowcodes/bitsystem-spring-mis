package ng.com.bitsystems.mis.models.admissions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.admissions.facilities.StartUsage;
import ng.com.bitsystems.mis.models.consultation.InitClinicals;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Admission extends InitClinicals {

    @ManyToOne
    @JoinColumn(name = "patients_id")
    private Patients patients;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private AppUsers appUsers;

    private String status;
    private LocalDate admissionDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "admission")
    private Set<StartUsage> startUsages = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private AdmissionMode admissionMode;

//    @ManyToMany
//    @JoinTable(name = "admission_prescription_administration",
//            joinColumns = @JoinColumn(name = "admission_id"),
//            inverseJoinColumns = @JoinColumn(name = "prescription_administration_id"))
//    private Set<PrescriptionAdministration> prescriptionAdministrations = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "admission_prescriptions",
            joinColumns = @JoinColumn(name = "admission_id"),
            inverseJoinColumns = @JoinColumn(name = "prescription_id"))
    private Set<Prescription> prescriptions = new HashSet<>();


    public Admission addFacilityUsage(StartUsage startUsage) {
        this.startUsages.add(startUsage);
        //startUsage.setInpatientAdmission(this);
        return this;
    }
}
