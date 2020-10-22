package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredConsultationCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredConsultations;
import org.springframework.core.convert.converter.Converter;

public class InsuredConsultationToInsuredConsultationCmd implements Converter<InsuredConsultations, InsuredConsultationCommand> {
    @Override
    public InsuredConsultationCommand convert(InsuredConsultations source) {
        return null;
    }
}
