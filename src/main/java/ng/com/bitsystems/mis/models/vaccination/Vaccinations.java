package ng.com.bitsystems.mis.models.vaccination;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Vaccinations  extends BaseEntity {


     private Integer id;
     private Integer name;
     private Integer description;
     private Integer priceCode;

}


