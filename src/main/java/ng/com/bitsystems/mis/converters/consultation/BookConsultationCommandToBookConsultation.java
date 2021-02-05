package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.BookConsultationCommand;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class BookConsultationCommandToBookConsultation implements Converter<BookConsultationCommand, BookConsultation> {
    private SpecializationCommandToSpecialization specializationCommandToSpecialization;

    public BookConsultationCommandToBookConsultation(SpecializationCommandToSpecialization specializationCommandToSpecialization) {
        this.specializationCommandToSpecialization = specializationCommandToSpecialization;
    }

    @Override
    public BookConsultation convert(BookConsultationCommand source) {
        if(source==null){
            return null;
        }
        final BookConsultation bookConsultation= new BookConsultation();
        bookConsultation.setId(source.getId());
        bookConsultation.setBookedConsultationDay(source.getBookedConsultationDay());
        bookConsultation.setSpecialization(specializationCommandToSpecialization.convert(source.getSpecializationCommand()));
        bookConsultation.setCreatedAt(source.getCreatedAt());
        if(source.getPatientId()!=null){
            Patients patients=new Patients();
            patients.setId(source.getPatientId());
            bookConsultation.setPatients(patients);
            Patients newPatient = patients.addConsultation(bookConsultation);
        }
        if(source.getUserId()!=null){
            Users users=new Users();
            users.setId(source.getUserId());
            bookConsultation.setUsers(users);
            Users receptionist = users.addBookConsultation(bookConsultation);
        }

        return bookConsultation;
    }
}
