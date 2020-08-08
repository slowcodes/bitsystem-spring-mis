package ng.com.bitsystems.mis.repositories.admissions.facilities;

import ng.com.bitsystems.mis.models.admissions.facilities.Wards;
import org.springframework.data.repository.CrudRepository;

public interface WardRepository extends CrudRepository<Wards, Long> {
}
