package ng.com.bitsystems.mis.repositories.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;
import org.springframework.data.repository.CrudRepository;

public interface IssuanceLogRepository extends CrudRepository<IssuanceLogs, Long> {
}
