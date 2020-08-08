package ng.com.bitsystems.mis.repositories.patients;

import ng.com.bitsystems.mis.models.patients.PatientsMedicalFileAttachment;
import org.springframework.data.repository.CrudRepository;

public interface PatientsMedicalFileAttachmentRepository extends CrudRepository<PatientsMedicalFileAttachment, Long> {
}
