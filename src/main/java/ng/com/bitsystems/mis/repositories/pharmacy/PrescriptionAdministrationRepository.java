package ng.com.bitsystems.mis.repositories.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.PrescriptionAdministration;
import org.springframework.data.repository.CrudRepository;

public interface PrescriptionAdministrationRepository extends CrudRepository<PrescriptionAdministration, Long> {
}
