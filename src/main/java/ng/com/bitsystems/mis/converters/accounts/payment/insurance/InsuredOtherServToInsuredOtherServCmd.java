package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredOtherServiceCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredOtherServices;
import org.springframework.core.convert.converter.Converter;

public class InsuredOtherServToInsuredOtherServCmd implements Converter<InsuredOtherServices, InsuredOtherServiceCommand> {
    @Override
    public InsuredOtherServiceCommand convert(InsuredOtherServices source) {
        return null;
    }
}
