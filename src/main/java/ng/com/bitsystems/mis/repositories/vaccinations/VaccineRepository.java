package ng.com.bitsystems.mis.repositories.vaccinations;

import ng.com.bitsystems.mis.models.vaccination.Vaccines;
import org.springframework.data.repository.CrudRepository;

public interface VaccineRepository extends CrudRepository<Vaccines, Long> {
}
