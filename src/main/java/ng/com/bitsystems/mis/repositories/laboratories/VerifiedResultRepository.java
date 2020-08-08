package ng.com.bitsystems.mis.repositories.laboratories;

import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import org.springframework.data.repository.CrudRepository;

public interface VerifiedResultRepository extends CrudRepository<VerifiedResults, Long> {
}
