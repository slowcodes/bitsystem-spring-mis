package ng.com.bitsystems.mis.converters.app;

import ng.com.bitsystems.mis.command.app.BusinessDetailCommand;
import ng.com.bitsystems.mis.models.app.BusinessDetails;
import org.springframework.core.convert.converter.Converter;

public class BusinessDetailCommandToBusinessDetail implements Converter<BusinessDetailCommand, BusinessDetails> {
    @Override
    public BusinessDetails convert(BusinessDetailCommand source) {
        return null;
    }
}
