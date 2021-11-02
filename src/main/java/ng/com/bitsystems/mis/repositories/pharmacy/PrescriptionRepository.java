package ng.com.bitsystems.mis.repositories.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import org.springframework.data.repository.CrudRepository;

public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {
}
