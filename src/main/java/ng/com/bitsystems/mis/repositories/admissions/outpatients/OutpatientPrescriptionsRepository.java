package ng.com.bitsystems.mis.repositories.admissions.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptions;
import org.springframework.data.repository.CrudRepository;

public interface OutpatientPrescriptionsRepository extends CrudRepository<OutpatientPrescriptions, Long> {
}
