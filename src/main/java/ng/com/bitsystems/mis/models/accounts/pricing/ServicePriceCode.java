package ng.com.bitsystems.mis.models.accounts.pricing;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.OtherServices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="service_price_code")
public class ServicePriceCode extends BaseEntity {

     @Column(name="service_price")
     private Double servicePrice;
     @Column(name = "discount_price")
     private Double discountPrice;

     //private Set <LaboratoryServiceTransactionDetail> laboratoryServiceTransactionDetails = new HashSet<>();
     //private Set <VaccinationTransactionsDetails> vaccinationTransactionsDetails = new HashSet<>();
     //private Set <BloodbankTransaction> bloodbankTransactions = new HashSet<>();

     @OneToOne
     private OtherServices otherServices;
}


