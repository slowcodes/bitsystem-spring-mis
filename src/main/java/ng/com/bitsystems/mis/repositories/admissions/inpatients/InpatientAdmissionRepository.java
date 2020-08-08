package ng.com.bitsystems.mis.repositories.admissions.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;
import org.springframework.data.repository.CrudRepository;

public interface InpatientAdmissionRepository extends CrudRepository<InpatientAdmission, Long> {
}
