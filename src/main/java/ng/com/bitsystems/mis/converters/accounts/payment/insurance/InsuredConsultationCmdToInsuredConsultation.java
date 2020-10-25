package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredConsultationCommand;
import ng.com.bitsystems.mis.converters.consultation.BookConsultationCommandToBookConsultation;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredConsultations;
import org.springframework.core.convert.converter.Converter;

public class InsuredConsultationCmdToInsuredConsultation implements Converter<InsuredConsultationCommand, InsuredConsultations> {

    private BookConsultationCommandToBookConsultation bookConsultationCommandToBookConsultation;
    private ProgramCommandToProgram programCommandToProgram;

    public InsuredConsultationCmdToInsuredConsultation(BookConsultationCommandToBookConsultation bookConsultationCommandToBookConsultation,
                                                       ProgramCommandToProgram programCommandToProgram) {
        this.bookConsultationCommandToBookConsultation = bookConsultationCommandToBookConsultation;
        this.programCommandToProgram = programCommandToProgram;
    }

    @Override
    public InsuredConsultations convert(InsuredConsultationCommand source) {
        if(source == null){
            return null;
        }
        final InsuredConsultations insuredConsultations = new InsuredConsultations();
        insuredConsultations.setId(source.getId());
        insuredConsultations.setPercentageIncured(source.getPercentageIncurred());
        insuredConsultations.setBookConsultation(bookConsultationCommandToBookConsultation.convert(source.getBookConsultationCommand()));
        insuredConsultations.setPrograms(programCommandToProgram.convert(source.getProgramsCommand()));
        return insuredConsultations;
    }
}
