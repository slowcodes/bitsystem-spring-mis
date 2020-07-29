package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PackageDetails  extends BaseEntity {


     private LaboratoryInvestigations laboratoryInvestigations;
     private Packages packages;



}


