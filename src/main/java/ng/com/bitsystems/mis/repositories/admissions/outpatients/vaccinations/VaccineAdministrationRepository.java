package ng.com.bitsystems.mis.repositories.admissions.outpatients.vaccinations;

import ng.com.bitsystems.mis.models.admissions.outpatient.vaccination.VaccineAdministration;
import org.springframework.data.repository.CrudRepository;

public interface VaccineAdministrationRepository extends CrudRepository<VaccineAdministration, Long> {
}
