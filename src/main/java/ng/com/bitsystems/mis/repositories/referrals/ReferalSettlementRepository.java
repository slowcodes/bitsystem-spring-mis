package ng.com.bitsystems.mis.repositories.referrals;

import ng.com.bitsystems.mis.models.referrals.ReferralSettlementDetails;
import org.springframework.data.repository.CrudRepository;

public interface ReferalSettlementRepository extends CrudRepository<ReferralSettlementDetails, Long> {
}
