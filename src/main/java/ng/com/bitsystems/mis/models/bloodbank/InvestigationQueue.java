package ng.com.bitsystems.mis.models.bloodbank;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1



/**
 * BloodbankQueueLaboratoryInvestigations generated by hbm2java
 */
import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InvestigationQueue extends BaseEntity {

     private Investigations investigations;
     private DonotionQueue donotionQueue;
}


