package ng.com.bitsystems.mis.repositories.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.PrecriptionAdministration;
import org.springframework.data.repository.CrudRepository;

public interface PrescriptionAdministrationRepository extends CrudRepository<PrecriptionAdministration, Long> {
}
