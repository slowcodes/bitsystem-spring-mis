package ng.com.bitsystems.mis.models.consultation;

import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
public class Clerks extends InitClinicals {

     @ManyToOne
     @JoinColumn(name = "patients_id")
     private Patients patients;

     @ManyToOne
     @JoinColumn(name ="user_id")
     private AppUsers appUsers;

     private LocalDate consultationDate;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "clerks")
     private Set<ClerkingSymptoms> clerkingSymptoms=new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "clerks")
     private Set<InternalOrganReview> internalOrganReviews=new HashSet<>();


    public Clerks addClerkingSymptoms(ClerkingSymptoms clerkingSymptoms) {
        this.clerkingSymptoms.add(clerkingSymptoms);
        clerkingSymptoms.setClerks(this);
        return this;
    }

    public Clerks addInternalOrganReview(InternalOrganReview internalOrganReview) {
        this.internalOrganReviews.add(internalOrganReview);
        internalOrganReview.setClerks(this);
        return this;
    }
}


