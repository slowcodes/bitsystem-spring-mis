package ng.com.bitsystems.mis.models;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InvoicesOtherItems  extends BaseEntity {

     private String otherItem;
     private String otherItemDesc;
     private Double cost;

}


