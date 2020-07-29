package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class UsersPrivilege  extends BaseEntity {


     private Users users;
     private String privileges;

}


