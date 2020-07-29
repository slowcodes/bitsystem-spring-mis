package ng.com.bitsystems.mis.models;
// Generated Jun 24, 2020 12:32:32 AM by Hibernate Tools 4.3.1


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BusinessDetails  extends BaseEntity {

     private String name;
     private String address1;
     private String address2;
     private String email;
     private String phone1;
     private String phone2;
     private byte[] logoDir;
     private String email2;

}


