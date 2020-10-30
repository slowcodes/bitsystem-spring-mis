package ng.com.bitsystems.mis.models.laboratories.bloodbank;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DonorRegistry extends BaseEntity {

     @OneToOne
     private Patients patients;

     @Enumerated(value = EnumType.STRING)
     private BloodGroups bloodGroup;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "donorRegistry")
     private Set<Donations> donations = new HashSet<>();

//    public DonorRegistry addDonationQueue(DonationQueue donationQueue) {
//        this.donationQueues.add(donationQueue);
//        donationQueue.setDonorRegistry(this);
//        return this;
//    }
}


