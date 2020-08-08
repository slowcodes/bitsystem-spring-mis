package ng.com.bitsystems.mis.repositories.admissions.outpatients.vaccinations;

import ng.com.bitsystems.mis.models.admissions.outpatient.vaccination.Vaccinations;
import org.springframework.data.repository.CrudRepository;

public interface VaccinationsRepository extends CrudRepository<Vaccinations, Long> {
}
