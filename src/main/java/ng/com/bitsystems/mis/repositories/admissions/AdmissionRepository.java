package ng.com.bitsystems.mis.repositories.admissions;

import ng.com.bitsystems.mis.models.admissions.Admission;
import org.springframework.data.repository.CrudRepository;

public interface AdmissionRepository extends CrudRepository<Admission, Long> {
}
