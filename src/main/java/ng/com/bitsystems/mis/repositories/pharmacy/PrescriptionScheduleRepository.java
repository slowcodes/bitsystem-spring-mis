package ng.com.bitsystems.mis.repositories.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.PrescriptionSchedule;
import org.springframework.data.repository.CrudRepository;

public interface PrescriptionScheduleRepository extends CrudRepository<PrescriptionSchedule, Long> {
}
