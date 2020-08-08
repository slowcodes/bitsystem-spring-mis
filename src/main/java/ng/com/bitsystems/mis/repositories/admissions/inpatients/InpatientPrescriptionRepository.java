package ng.com.bitsystems.mis.repositories.admissions.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptions;
import org.springframework.data.repository.CrudRepository;

public interface InpatientPrescriptionRepository extends CrudRepository<InpatientPrescriptions, Long> {
}
