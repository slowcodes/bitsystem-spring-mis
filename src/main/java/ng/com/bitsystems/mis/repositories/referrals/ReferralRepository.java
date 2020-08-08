package ng.com.bitsystems.mis.repositories.referrals;

import ng.com.bitsystems.mis.models.referrals.Referrals;
import org.springframework.data.repository.CrudRepository;

public interface ReferralRepository extends CrudRepository<Referrals, Long> {
}
