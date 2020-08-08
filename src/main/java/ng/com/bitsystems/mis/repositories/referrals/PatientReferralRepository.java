package ng.com.bitsystems.mis.repositories.referrals;

import ng.com.bitsystems.mis.models.referrals.PatientsReferrals;
import org.springframework.data.repository.CrudRepository;

public interface PatientReferralRepository extends CrudRepository<PatientsReferrals, Long> {
}
