package ng.com.bitsystems.mis.models.admissions;

import lombok.*;
import ng.com.bitsystems.mis.models.consultation.InitClinicals;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Admission extends InitClinicals {
    private Patients patients;
    private Users users;
    private String status;
    private Date admissionDate;
}
