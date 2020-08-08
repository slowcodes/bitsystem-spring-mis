package ng.com.bitsystems.mis.models.laboratories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CollectedSamples extends BaseEntity {

     @OneToOne
     private LaboratoryTransactionDetail laboratoryTransactionDetail;

     @ManyToOne
     @JoinColumn(name = "users_id")
     private Users users;

     @Enumerated(value = EnumType.STRING)
     private SampleType sampleType;

     private Integer analysed;
     private LocalDate dateOfCollection;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "collectedSamples")
     private Set<ExperimentReadings> experimentResultsByParams = new HashSet<>();
}


