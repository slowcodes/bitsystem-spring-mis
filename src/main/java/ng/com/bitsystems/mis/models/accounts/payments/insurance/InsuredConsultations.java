package ng.com.bitsystems.mis.models.accounts.payments.insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InsuredConsultations extends InsuranceTransactions {

    @OneToOne
    private BookConsultation bookConsultation;
}
