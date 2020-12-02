package ng.com.bitsystems.mis.models.users;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.invoice.OtherServiceInvoiceDetails;

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
public class Accountants extends Users {


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Set<OtherServiceInvoiceDetails> otherServiceInvoiceDetails = new HashSet<>();

    public Accountants addAccountBooks(OtherServiceInvoiceDetails otherServiceInvoiceDetails) {
        this.otherServiceInvoiceDetails.add(otherServiceInvoiceDetails);
        otherServiceInvoiceDetails.setCreatedBy(this);
        return this;
    }
}
