package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Vaccinations extends BaseEntity {


     private Integer name;
     private Integer description;
     private Integer priceCode;



}


