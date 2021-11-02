package ng.com.bitsystems.mis.models.inventory.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Requisitions extends BaseEntity {
     @ManyToOne
     @JoinColumn(name="users_id")
     private AppUsers appUsers;

     private LocalDate dateOfRequisition;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "requisitions")
     private Set<RequisitionDetails> requistionDetails = new HashSet<>();

    public Requisitions addRequisitionDetails(RequisitionDetails requisitionDetails) {
        this.requistionDetails.add(requisitionDetails);
        requisitionDetails.setRequisitions(this);
        return this;
    }
}


