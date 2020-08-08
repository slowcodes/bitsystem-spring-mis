package ng.com.bitsystems.mis.repositories.admissions.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptionSchedule;
import org.springframework.data.repository.CrudRepository;

public interface OutpatientPrescriptionScheduleRepository extends CrudRepository<OutpatientPrescriptionSchedule, Long> {
}
