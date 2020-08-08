package ng.com.bitsystems.mis.repositories.admissions.outpatients.vaccinations;

import ng.com.bitsystems.mis.models.admissions.outpatient.vaccination.VaccinationPrescriptionGeneratedAdmin;
import org.springframework.data.repository.CrudRepository;

public interface GeneratedVaccineAdministrationRepository extends CrudRepository<VaccinationPrescriptionGeneratedAdmin, Long> {
}
