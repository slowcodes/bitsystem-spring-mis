package ng.com.bitsystems.mis.models.invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.MappedSuperclass;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Invoice extends Transaction {

    private Set<LaboratoryInvoiceDetailsService> laboratoryInvoiceDetails = new HashSet<>();
    private Set<OtherServiceInvoiceDetails> otherServiceInvoiceDetails = new HashSet<>();
    private Set<PharmacyInvoiceDetailsService> pharmacyInvoiceDetails = new HashSet<>();
}
