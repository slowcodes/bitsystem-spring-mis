package ng.com.bitsystems.mis.repositories.admissions;

import ng.com.bitsystems.mis.models.admissions.Discharged;
import org.springframework.data.repository.CrudRepository;

public interface DischargeRepository extends CrudRepository<Discharged, Long> {
}
