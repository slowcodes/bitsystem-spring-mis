package ng.com.bitsystems.mis.repositories.vaccinations;

import ng.com.bitsystems.mis.models.vaccination.VaccineAdministration;
import org.springframework.data.repository.CrudRepository;

public interface VaccineAdministrationRepository extends CrudRepository<VaccineAdministration, Long> {
}
