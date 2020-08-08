package ng.com.bitsystems.mis.repositories.laboratories;

import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import org.springframework.data.repository.CrudRepository;

public interface LaboratoryInvestigationRepository extends CrudRepository<LaboratoryInvestigations, Long> {
}
