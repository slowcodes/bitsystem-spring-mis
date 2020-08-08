package ng.com.bitsystems.mis.repositories.admissions.outpatients.vaccinations;

import ng.com.bitsystems.mis.models.admissions.outpatient.vaccination.VaccinationPrescriptions;
import org.springframework.data.repository.CrudRepository;

public interface VaccinationPrescriptionRepository extends CrudRepository<VaccinationPrescriptions, Long> {
}
