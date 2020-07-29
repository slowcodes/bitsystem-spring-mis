package ng.com.bitsystems.mis.models;


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
public class Referrals extends Person {

     private String organisation;
     private String bank;
     private String account;
     private String address;
     private Set laboratoryTransactionDetailses = new HashSet(0);


}


