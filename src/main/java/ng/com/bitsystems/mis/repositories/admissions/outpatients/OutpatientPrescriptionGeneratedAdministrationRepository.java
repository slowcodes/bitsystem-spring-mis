package ng.com.bitsystems.mis.repositories.admissions.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptionGeneratedAdministration;
import org.springframework.data.repository.CrudRepository;

public interface OutpatientPrescriptionGeneratedAdministrationRepository
        extends CrudRepository<OutpatientPrescriptionGeneratedAdministration, Long> {
}
