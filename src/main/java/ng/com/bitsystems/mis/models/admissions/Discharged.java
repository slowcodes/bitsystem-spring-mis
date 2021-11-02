package ng.com.bitsystems.mis.models.admissions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Discharged extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "users_id")
    private AppUsers appUsers;

    private LocalDate dateDischarged;
    private LocalDateTime timeOfDischarge;
    private String comment;

    @OneToOne
    private Admission admission;
}
