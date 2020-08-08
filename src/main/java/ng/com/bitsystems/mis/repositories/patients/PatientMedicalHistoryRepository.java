package ng.com.bitsystems.mis.repositories.patients;

import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import org.springframework.data.repository.CrudRepository;

public interface PatientMedicalHistoryRepository extends CrudRepository<PatientsMedicalHistory, Long> {
}
