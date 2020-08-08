package ng.com.bitsystems.mis.repositories.patients;

import ng.com.bitsystems.mis.models.patients.Patients;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patients, Long> {
}
