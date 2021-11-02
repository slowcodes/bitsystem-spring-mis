package ng.com.bitsystems.mis.models.invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.laboratory.BaseLabTxnDetail;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryInvoiceDetails extends BaseLabTxnDetail {

     @ManyToOne
     @JoinColumn(name = "invoice_id")
     private Invoice invoice;

}


