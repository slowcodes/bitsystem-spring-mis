package ng.com.bitsystems.mis.models.inventory.requests;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Requisitions extends BaseEntity {
     private Users users;
     private Date date;
     private Date dateOfRequisition;
}


