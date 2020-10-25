package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredConsultationCommand;
import ng.com.bitsystems.mis.converters.consultation.BookConsultationToBookConsultationCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredConsultations;
import org.springframework.core.convert.converter.Converter;

public class InsuredConsultationToInsuredConsultationCmd implements Converter<InsuredConsultations, InsuredConsultationCommand> {

    private ProgramToProgramCommand programToProgramCommand;
    private BookConsultationToBookConsultationCommand bookConsultationToBookConsultationCommand;

    public InsuredConsultationToInsuredConsultationCmd(ProgramToProgramCommand programToProgramCommand,
                                                       BookConsultationToBookConsultationCommand bookConsultationToBookConsultationCommand) {
        this.programToProgramCommand = programToProgramCommand;
        this.bookConsultationToBookConsultationCommand = bookConsultationToBookConsultationCommand;
    }

    @Override
    public InsuredConsultationCommand convert(InsuredConsultations source) {

        if(source == null){
            return null;
        }
        final InsuredConsultationCommand insuredConsultationCommand=new InsuredConsultationCommand();

        insuredConsultationCommand.setId(source.getId());
        insuredConsultationCommand.setBookConsultationCommand(bookConsultationToBookConsultationCommand.convert(source.getBookConsultation()));
        insuredConsultationCommand.setPercentageIncurred(source.getPercentageIncured());
        insuredConsultationCommand.setProgramsCommand(programToProgramCommand.convert(source.getPrograms()));

        return insuredConsultationCommand;
    }
}
