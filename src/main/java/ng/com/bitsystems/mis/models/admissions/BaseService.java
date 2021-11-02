package ng.com.bitsystems.mis.models.admissions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseService extends BaseEntity {
    @OneToOne
    private ServicePriceCode priceCode;

    @OneToOne
    private ServiceTransaction serviceTransaction;

    private LocalDateTime timeOfTransaction;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patients patients;
}
