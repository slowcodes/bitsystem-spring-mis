package ng.com.bitsystems.mis.models.app;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BusinessDetails  extends BaseEntity{

     private String name;
     private String address1;
     private String address2;
     private String email;
     private String phone1;
     private String phone2;
     private byte[] logoDir;
     private String email2;

}


