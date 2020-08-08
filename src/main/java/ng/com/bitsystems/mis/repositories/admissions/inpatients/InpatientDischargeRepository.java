package ng.com.bitsystems.mis.repositories.admissions.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientDischarged;
import org.springframework.data.repository.CrudRepository;

public interface InpatientDischargeRepository extends CrudRepository<InpatientDischarged, Long> {
}
