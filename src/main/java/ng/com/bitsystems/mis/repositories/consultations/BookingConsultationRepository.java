package ng.com.bitsystems.mis.repositories.consultations;

import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import org.springframework.data.repository.CrudRepository;

public interface BookingConsultationRepository extends CrudRepository<BookConsultation, Long> {
}
