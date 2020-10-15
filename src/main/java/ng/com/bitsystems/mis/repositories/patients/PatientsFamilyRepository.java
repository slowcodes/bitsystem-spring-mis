package ng.com.bitsystems.mis.repositories.patients;

import ng.com.bitsystems.mis.models.patients.FamilyFolder;
import org.springframework.data.repository.CrudRepository;

public interface PatientsFamilyRepository extends CrudRepository<FamilyFolder, Long> {
}
