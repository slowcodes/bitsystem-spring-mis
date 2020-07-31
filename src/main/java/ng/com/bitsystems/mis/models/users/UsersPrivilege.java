package ng.com.bitsystems.mis.models.users;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class UsersPrivilege  extends BaseEntity {


     private AccountHolder accountHolder;
     private String privileges;


}


