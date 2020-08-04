package ng.com.bitsystems.mis.models.invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Invoice extends Transaction {
    private String status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private Set<LaboratoryInvoiceDetails> laboratoryInvoiceDetails = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private Set<OtherServiceInvoiceDetails> otherServiceInvoiceDetails = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private Set<PharmacyInvoiceDetailsSale> pharmacyInvoiceDetailsSales = new HashSet<>();
}
