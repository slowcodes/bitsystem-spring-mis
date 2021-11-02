package ng.com.bitsystems.mis.models.referrals;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.transactions.Sales;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;
import ng.com.bitsystems.mis.models.users.Person;

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
public class Referrals  extends Person {

    private String organisation;
    private String bank;
    private String account;
    private Long referral_id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
    private Set<Sales> sales = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
    private Set<ServiceTransaction> services = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
    private Set<Invoice> invoices = new HashSet<>();

    public Referrals addInvoice(Invoice invoice) {
        invoices.add(invoice);
        invoice.setReferral(this);
        return this;
    }

    public Referrals addSales(Sales sales) {
        this.sales.add(sales);
        sales.setReferral(this);
        return this;
    }
}


