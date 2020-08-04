package ng.com.bitsystems.mis.models.admissions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.consultation.InitClinicals;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Admission extends InitClinicals {

    @ManyToOne
    @JoinColumn(name = "patients_id")
    private Patients patients;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    private String status;
    private LocalDate admissionDate;
}
