package ng.com.bitsystems.mis.repositories.admissions.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionSchedule;
import org.springframework.data.repository.CrudRepository;

public interface InpatientPrescriptionScheduleRepository extends CrudRepository<InpatientPrescriptionSchedule, Long> {
}
