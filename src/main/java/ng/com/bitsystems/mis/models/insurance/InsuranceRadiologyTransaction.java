package ng.com.bitsystems.mis.models.insurance;

import lombok.*;
import ng.com.bitsystems.mis.models.laboratories.RadiologyTransactionDetails;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InsuranceRadiologyTransaction  extends Insurance {
     private RadiologyTransactionDetails radiologyTransactionDetails;
}


