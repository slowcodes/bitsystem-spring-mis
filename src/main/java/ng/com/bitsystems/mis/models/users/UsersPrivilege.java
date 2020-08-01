package ng.com.bitsystems.mis.models.users;

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
public class UsersPrivilege  extends BaseEntity {


     private AccountHolder accountHolder;
     private String privileges;


}


