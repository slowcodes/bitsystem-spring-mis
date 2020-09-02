package ng.com.bitsystems.mis.repositories.admissions.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import org.springframework.data.repository.CrudRepository;

public interface OutpatientAdmissionRepository extends CrudRepository<OutpatientAdmission, Long> {
}
