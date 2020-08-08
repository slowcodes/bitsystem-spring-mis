package ng.com.bitsystems.mis.repositories.patients;

import ng.com.bitsystems.mis.models.patients.PatientsVitals;
import org.springframework.data.repository.CrudRepository;

public interface PatientVitalsRepository extends CrudRepository<PatientsVitals, Long> {
}
