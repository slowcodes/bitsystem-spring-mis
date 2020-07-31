package ng.com.bitsystems.mis.models.transactions.bloodbank;
import lombok.*;
import ng.com.bitsystems.mis.models.bloodbank.Storage;
import ng.com.bitsystems.mis.models.transactions.Sales;
import ng.com.bitsystems.mis.models.transactions.Service;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BloodbankService extends Sales {

     private Storage storage;
     private BloodbankTransaction bloodbankTransaction;

}


