package ng.com.bitsystems.mis.models.invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryServiceTransactionDetail;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryInvoiceDetailsService extends LaboratoryServiceTransactionDetail {
     private String status;
}


