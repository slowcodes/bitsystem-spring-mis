package ng.com.bitsystems.mis.models.consultation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BookConsultation {
    private Patients patients;
    private Users user;
    private Consultants consultants;
    private LocalDate createdAt;
    private LocalDate bookedConsultationDay;

    @Column(name="consultation_fee")
    private ServicePriceCode servicePriceCode;
}
