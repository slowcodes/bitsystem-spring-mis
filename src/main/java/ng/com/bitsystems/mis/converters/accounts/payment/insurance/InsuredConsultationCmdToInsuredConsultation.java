package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredConsultationCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredConsultations;
import org.springframework.core.convert.converter.Converter;

public class InsuredConsultationCmdToInsuredConsultation implements Converter<InsuredConsultationCommand, InsuredConsultations> {
    @Override
    public InsuredConsultations convert(InsuredConsultationCommand source) {
        return null;
    }
}
