package ng.com.bitsystems.mis.repositories.patients;

import ng.com.bitsystems.mis.models.patients.PatientsMedicalActivityListing;
import org.springframework.data.repository.CrudRepository;

public interface PatientMedicalActivityListingRepository extends CrudRepository<PatientsMedicalActivityListing, Long> {
}
