package ng.com.bitsystems.mis.models;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Invoices  extends BaseEntity {

     private Integer itemId;
     private String itemType;
     private String notes;
}


