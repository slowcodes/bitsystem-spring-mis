package ng.com.bitsystems.mis.repositories.laboratories;

import ng.com.bitsystems.mis.models.laboratories.Results;
import org.springframework.data.repository.CrudRepository;

public interface ResultRepository extends CrudRepository<Results, Long> {
}
