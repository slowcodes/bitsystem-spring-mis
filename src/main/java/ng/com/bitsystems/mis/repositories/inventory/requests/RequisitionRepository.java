package ng.com.bitsystems.mis.repositories.inventory.requests;

import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import org.springframework.data.repository.CrudRepository;

public interface RequisitionRepository extends CrudRepository<Requisitions, Long> {
}
