package ng.com.bitsystems.mis.models;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class TxnLabDetails  extends BaseEntity {

     private String transactionId;
     private String provisionalDiagnosis;
     private String labNumber;
     private String presentingComplaint;
     private Integer displayAge;
     private Integer dailySerial;

}


