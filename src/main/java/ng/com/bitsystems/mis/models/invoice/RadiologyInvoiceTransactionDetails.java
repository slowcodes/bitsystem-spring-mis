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
public class RadiologyInvoiceTransactionDetails extends Invoice {
     private Set radiologyInvoiceTransactionses = new HashSet(0);
}


