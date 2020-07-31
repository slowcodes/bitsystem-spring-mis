package ng.com.bitsystems.mis.models.insurance;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Programs extends BaseEntity {
     private String insuranceCompany;
     private Integer serviceDiscount;
     private Integer companyEmail;
     private Integer companyPhone;
     private Set insuranceVacinationTransactions = new HashSet(0);
     private Set insurancePharmacyTransactions = new HashSet(0);
     private Set insuranceLaboratoryTransactions = new HashSet(0);
     private Set insuranceRadiologyTransactions = new HashSet(0);
     private Set insuranceBloodbankTransactions = new HashSet(0);
}


