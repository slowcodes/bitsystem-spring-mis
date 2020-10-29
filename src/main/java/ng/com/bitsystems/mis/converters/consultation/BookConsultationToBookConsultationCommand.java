package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.BookConsultationCommand;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import org.springframework.core.convert.converter.Converter;

public class BookConsultationToBookConsultationCommand implements Converter<BookConsultation, BookConsultationCommand> {
    private SpecializationToSpecializationCommand specializationToSpecializationCommand;

    public BookConsultationToBookConsultationCommand(SpecializationToSpecializationCommand specializationToSpecializationCommand) {
        this.specializationToSpecializationCommand = specializationToSpecializationCommand;
    }

    @Override
    public BookConsultationCommand convert(BookConsultation source) {
        if(source==null){
            return null;
        }
        final BookConsultationCommand bookConsultationCommand=new BookConsultationCommand();
        bookConsultationCommand.setId(source.getId());
        bookConsultationCommand.setBookedConsultationDay(source.getBookedConsultationDay());
        bookConsultationCommand.setCreatedAt(source.getCreatedAt());
        if(source.getPatients()!=null){
            bookConsultationCommand.setPatientId(source.getPatients().getId());
        }
        if(source.getUsers()!=null)
            bookConsultationCommand.setUserId(source.getUsers().getId());
        bookConsultationCommand.setSpecializationCommand(specializationToSpecializationCommand.convert(source.getSpecialization()));
        return bookConsultationCommand;
    }
}
