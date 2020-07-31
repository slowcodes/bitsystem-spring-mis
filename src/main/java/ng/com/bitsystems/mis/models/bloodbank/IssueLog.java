package ng.com.bitsystems.mis.models.bloodbank;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class IssueLog extends BaseEntity {

     private Storage storage;
     private Patients patients;
     private Users users;
     private Date issueDate;

}


