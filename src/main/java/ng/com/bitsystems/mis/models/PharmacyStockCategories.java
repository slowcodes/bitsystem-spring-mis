package ng.com.bitsystems.mis.models;

import lombok.*;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyStockCategories  extends BaseEntity {


     private String grpName;
     private Set pharmacyStocks = new HashSet(0);



}


