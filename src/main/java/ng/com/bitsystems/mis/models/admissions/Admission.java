package ng.com.bitsystems.mis.models.admissions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.consultation.InitClinicals;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Admission extends InitClinicals {
    private Patients patients;
    private Users users;
    private String status;
    private Date admissionDate;
}
