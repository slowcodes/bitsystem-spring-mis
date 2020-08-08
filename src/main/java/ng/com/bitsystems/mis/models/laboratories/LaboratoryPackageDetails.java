package ng.com.bitsystems.mis.models.laboratories;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class LaboratoryPackageDetails  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "packages_id")
     private Packages packages;

     @ManyToOne
     @JoinColumn(name = "laboratoryinvestivations_id")
     private LaboratoryInvestigations laboratoryInvestigations;

     @OneToMany(mappedBy = "laboratoryPackageDetails")
     private Set<ObservationQueue> observationQueue = new HashSet<>();

     @OneToMany(mappedBy = "laboratoryPackageDetails")
     private  Set<SampleCollectionQueue> sampleCollectionQueues = new HashSet<>();
}


