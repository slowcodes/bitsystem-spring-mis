package ng.com.bitsystems.mis.repositories.laboratories;

import ng.com.bitsystems.mis.models.laboratories.Queue;
import org.springframework.data.repository.CrudRepository;

public interface QueueRepository extends CrudRepository<Queue, Long> {
}
