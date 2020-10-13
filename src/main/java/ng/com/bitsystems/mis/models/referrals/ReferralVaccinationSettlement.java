package ng.com.bitsystems.mis.models.referrals;

import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

public class ReferralVaccinationSettlement extends BaseEntity {

    @OneToOne
    private ReferralSettlements referralSettlements;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlements")
    private Set<VaccinationTransactionsDetails> vaccinationTransactionsDetails = new HashSet<>();

}
