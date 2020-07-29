package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Suppliers  extends BaseEntity {

     private String address;
     private String phone;
     private String companyName;
     private String contactPerson;
     private String contactEmail;
     private String contactPhone;

}


