package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.BookConsultationCommand;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import org.springframework.core.convert.converter.Converter;

public class BookConsultationCommandToBookConsultation implements Converter<BookConsultationCommand, BookConsultation> {
    @Override
    public BookConsultation convert(BookConsultationCommand source) {
        return null;
    }
}
