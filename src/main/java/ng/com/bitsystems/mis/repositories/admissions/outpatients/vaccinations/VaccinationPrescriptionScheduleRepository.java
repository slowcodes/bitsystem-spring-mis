package ng.com.bitsystems.mis.repositories.admissions.outpatients.vaccinations;

import ng.com.bitsystems.mis.models.admissions.outpatient.vaccination.VaccinationPrescriptionSchedule;
import org.springframework.data.repository.CrudRepository;

public interface VaccinationPrescriptionScheduleRepository extends CrudRepository<VaccinationPrescriptionSchedule, Long> {
}
