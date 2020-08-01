package ng.com.bitsystems.mis.models.bloodbank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Storage extends BaseEntity {

     private ServicePriceCode servicePriceCode;
     private String location;
     private String description;
     private Set bloodbloodDonorIssuanceLogses = new HashSet(0);
     private Set bloodbankTransactionses = new HashSet(0);
     private Set bloodbankDonorDonateds = new HashSet(0);
}


