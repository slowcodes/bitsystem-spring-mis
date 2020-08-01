package ng.com.bitsystems.mis.models.transactions.bloodbank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.bloodbank.Storage;
import ng.com.bitsystems.mis.models.transactions.Sales;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BloodbankService extends Sales {

     private Storage storage;
     private BloodbankTransaction bloodbankTransaction;

}


