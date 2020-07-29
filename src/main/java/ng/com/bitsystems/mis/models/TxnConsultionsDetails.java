package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class TxnConsultionsDetails  extends BaseEntity {


     private PricingCode pricingCode;
     private String tmpTransactionId;
     private int frequency;
     private String tnxType;
     private int trackId;
     private Integer useDiscountPrice;
     private String packageId;
     private Integer status;


}


