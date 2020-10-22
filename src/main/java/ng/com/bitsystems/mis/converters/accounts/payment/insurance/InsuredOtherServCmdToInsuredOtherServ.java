package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredOtherServiceCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredOtherServices;
import org.springframework.core.convert.converter.Converter;

public class InsuredOtherServCmdToInsuredOtherServ implements Converter<InsuredOtherServiceCommand, InsuredOtherServices> {
    @Override
    public InsuredOtherServices convert(InsuredOtherServiceCommand source) {
        return null;
    }
}
