package ng.com.bitsystems.mis.models.invoice;

import lombok.*;
import ng.com.bitsystems.mis.models.transactions.LaboratoryTransactionDetails;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryInvoiceTrasactions  extends LaboratoryTransactionDetails {

     private LaboratoryInvoiceDetails laboratoryInvoiceDetails;

}


