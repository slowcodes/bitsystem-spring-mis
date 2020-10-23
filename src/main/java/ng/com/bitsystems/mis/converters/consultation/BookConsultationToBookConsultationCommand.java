package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.BookConsultationCommand;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import org.springframework.core.convert.converter.Converter;

public class BookConsultationToBookConsultationCommand implements Converter<BookConsultation, BookConsultationCommand> {
    @Override
    public BookConsultationCommand convert(BookConsultation source) {
        return null;
    }
}
