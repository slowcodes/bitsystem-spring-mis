package ng.com.bitsystems.mis.repositories.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.PrecriptionAdministration;
import org.springframework.data.repository.CrudRepository;

public interface PrecriptionAdministrationRepository extends CrudRepository<PrecriptionAdministration, Long> {
}
