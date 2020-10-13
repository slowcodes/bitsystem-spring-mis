package ng.com.bitsystems.mis.repositories.vaccinations;

import ng.com.bitsystems.mis.models.vaccination.VaccineDoses;
import org.springframework.data.repository.CrudRepository;

public interface VaccineDosageRepository extends CrudRepository<VaccineDoses, Long> {
}
