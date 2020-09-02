package ng.com.bitsystems.mis.services.springdatajpa.consulatation;

import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import ng.com.bitsystems.mis.repositories.consultations.BookingConsultationRepository;
import ng.com.bitsystems.mis.services.consultations.BookingConsultationService;

import java.util.HashSet;
import java.util.Set;

public class BookingConsultationSDJPaService implements BookingConsultationService {
    private BookingConsultationRepository bookingConsultationRepository;

    @Override
    public Set<BookConsultation> findAll() {
        Set<BookConsultation> bookConsultations = new HashSet<>();
        bookingConsultationRepository.findAll().forEach(bookConsultations::add);
        return bookConsultations;
    }

    @Override
    public BookConsultation findByID(Long aLong) {
        return bookingConsultationRepository.findById(aLong).get();
    }

    @Override
    public BookConsultation add(BookConsultation object) {
        return bookingConsultationRepository.save(object);
    }

    @Override
    public void delete(BookConsultation object) {
        bookingConsultationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        bookingConsultationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(BookConsultation object) {

    }
}
