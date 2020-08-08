package ng.com.bitsystems.mis.repositories.consultations;

import ng.com.bitsystems.mis.models.consultation.Consultants;
import org.springframework.data.repository.CrudRepository;

public interface ConsultantRepository extends CrudRepository<Consultants, Long> {
}
