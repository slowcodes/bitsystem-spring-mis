package ng.com.bitsystems.mis.models.consultation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredConsultations;
import ng.com.bitsystems.mis.models.patients.Patients;
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
public class BookConsultation extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "patients_id")
    private Patients patients;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "consultants_id")
    private Consultants consultants;

    private LocalDate createdAt;
    private LocalDate bookedConsultationDay;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookConsultation")
    Set<InsuredConsultations> insuredConsultations = new HashSet<>();

}
