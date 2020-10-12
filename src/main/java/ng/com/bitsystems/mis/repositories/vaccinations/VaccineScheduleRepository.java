package ng.com.bitsystems.mis.repositories.vaccinations;

import ng.com.bitsystems.mis.models.vaccination.VaccineSchedule;
import org.springframework.data.repository.CrudRepository;

public interface VaccineScheduleRepository extends CrudRepository<VaccineSchedule, Long> {
}
