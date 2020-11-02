package ng.com.bitsystems.mis.models.pharmacy;


import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyRewardBasedPromo;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactionsDetails;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
public class PharmacyProducts  extends Drugs {
     @ManyToMany
     @JoinTable(name = "pharmacy_retails",
             joinColumns = @JoinColumn(name = "pharmacyproducts_id"),
             inverseJoinColumns = @JoinColumn(name = "retailmeasure_id"))
     private Set<RetailMeasure> retailMeasure = new HashSet<>();

     @ManyToMany
     @JoinTable(name = "pharmacy_category",
             joinColumns = @JoinColumn(name = "pharmacyproducts_id"),
             inverseJoinColumns = @JoinColumn(name = "category_id"))
     private Set<Category> categories = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacyProducts")
     private Set<PharmacyPromosProducts> pharmacyPromosProductses = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacyProducts")
     private Set<PharmacySupplyTransactionsDetails> transactionsSupplies = new HashSet<>();

     @ManyToMany
     @JoinTable(name = "pharmacy_suppliers",
             joinColumns = @JoinColumn(name = "pharmacyproducts_id"),
             inverseJoinColumns = @JoinColumn(name = "suppliers_id"))
     private Set<Suppliers> suppliers = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "promosProducts")
     private Set<PharmacyRewardBasedPromo> pharmacyRewardBasedPromos = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "rewardProducts")
     private Set<PharmacyRewardBasedPromo> pharmacyProducts = new HashSet<>();


     @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacyProducts")
     private Set<Barcodes> barcodes = new HashSet<>();


     @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacyProducts")
     private Set<PharmacyTransactionDetails> pharmacyTransactions = new HashSet<>();

    public PharmacyProducts addPharmacy(Barcodes barcodes) {
         this.barcodes.add(barcodes);
         barcodes.setPharmacyProducts(this);
         return this;
    }
}


