package ng.com.bitsystems.mis.repositories.vaccinations;

import ng.com.bitsystems.mis.models.vaccination.DefaultPrescription;
import org.springframework.data.repository.CrudRepository;

public interface DefaultPrescriptionRepository extends CrudRepository<DefaultPrescription, Long> {
}
