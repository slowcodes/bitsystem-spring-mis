package ng.com.bitsystems.mis.models.invoice;

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
public class LaboratoryInvoiceDetails  extends Invoice {

     private Set laboratoryInvoiceTrasactionses = new HashSet(0);

}


