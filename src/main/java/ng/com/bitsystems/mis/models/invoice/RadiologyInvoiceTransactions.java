package ng.com.bitsystems.mis.models.consultation;


import lombok.*;
import ng.com.bitsystems.mis.models.laboratories.RadiologyTransactionDetails;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class RadiologyInvoiceTransactions  extends RadiologyTransactionDetails {

     private String status;

}


