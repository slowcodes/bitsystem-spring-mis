package ng.com.bitsystems.mis.repositories.rewards.loyalties;

import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyGains;
import org.springframework.data.repository.CrudRepository;

public interface PatientLoyaltyGainRepository extends CrudRepository<PatientsLoyaltyGains, Long> {
}
