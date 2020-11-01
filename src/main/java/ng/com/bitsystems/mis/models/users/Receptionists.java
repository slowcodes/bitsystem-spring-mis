package ng.com.bitsystems.mis.models.users;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.BleedingSchedule;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Receptionists extends Users {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<BookConsultation> bookConsultations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<BleedingSchedule> bleedingSchedules = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<ResultCollectionLog> issuedResults = new HashSet<>();

    public Receptionists addBookConsultation(BookConsultation bookConsultation) {
        this.bookConsultations.add(bookConsultation);
        bookConsultation.setUsers(this);
        return this;
    }

    public Receptionists addBleedingSchedule(BleedingSchedule bleedingSchedule) {
        this.bleedingSchedules.add(bleedingSchedule);
        bleedingSchedule.setUsers(this);
        return this;
    }

    public Receptionists addResultCollectionLog(ResultCollectionLog collectionLog) {

        this.issuedResults.add(collectionLog);
        collectionLog.setUsers(this);
        return this;
    }
}
