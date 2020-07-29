package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Requests  extends BaseEntity {

     private String groupName;
     private String item;
     private int quantity;
     private String buyer;
     private String status;

}


