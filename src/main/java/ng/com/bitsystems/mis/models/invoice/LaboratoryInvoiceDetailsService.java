package ng.com.bitsystems.mis.models.invoice;

import lombok.*;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryServiceTransactionDetail;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryInvoiceDetailsService extends LaboratoryServiceTransactionDetail {
     private String status;
}


