package ng.com.bitsystems.mis.models.vaccination;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vaccines extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "drug_id")
    private PharmacyProducts pharmacyProducts;

    @OneToOne
    private SalesPriceCode priceCode;

    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vaccine")
    private Set<VaccinationTransactionsDetails> vaccinationTransactionsDetails=new HashSet<>();

    public Vaccines addTransaction(VaccinationTransactionsDetails transactions) {
        vaccinationTransactionsDetails.add(transactions);
        transactions.setVaccinations(this);
        return this;
    }
}
