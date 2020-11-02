package ng.com.bitsystems.mis.repositories.patients;

import ng.com.bitsystems.mis.models.patients.FamilyHistory;
import org.springframework.data.repository.CrudRepository;

public interface PatientFamilyHistoryRepository extends CrudRepository<FamilyHistory, Long> {
}
