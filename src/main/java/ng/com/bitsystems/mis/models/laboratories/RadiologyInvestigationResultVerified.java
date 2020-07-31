package ng.com.bitsystems.mis.models.laboratories;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class RadiologyInvestigationResultVerified  extends BaseEntity {


     private RadiologyInvestigationResultSummary radiologyInvestigationResultSummary;
     private Users users;
     private Date timeOfVerfication;


}


