package ng.com.bitsystems.mis.models.app;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


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


