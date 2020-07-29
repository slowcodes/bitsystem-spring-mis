package ng.com.bitsystems.mis.models;
// Generated Jun 24, 2020 12:32:32 AM by Hibernate Tools 4.3.1


import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccineShedulesDetails  extends BaseEntity {

     private LaboratoryInvestigations laboratoryInvestigations;
     private String txnId;
     private Integer medicationId;
     private Date appropriateDate;
     private String status;


}


