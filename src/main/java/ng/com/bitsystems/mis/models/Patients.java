package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Patients  extends Person {

     @OneToOne
     private States states;
     private String phone;
     private Date regDay;
     private String address;
     private Date dob;
     private String occupation;
     private String marritalStatus;
     private byte[] photo;


}


