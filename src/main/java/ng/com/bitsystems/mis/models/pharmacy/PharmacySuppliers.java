package ng.com.bitsystems.mis.models.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacySuppliers  extends BaseEntity {

     private String companyName;
     private String contactPerson;
     private String contactPhone;
     private String contactEmail;
     private String address;
     private Date registrationDate;
     private String sex;
     private String state;
     private String comment;
}


