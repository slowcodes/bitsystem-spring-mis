package ng.com.bitsystems.mis.converters.app;

import ng.com.bitsystems.mis.command.app.BusinessDetailCommand;
import ng.com.bitsystems.mis.models.app.BusinessDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BusinessDetailCommandToBusinessDetail implements Converter<BusinessDetailCommand, BusinessDetails> {
    @Override
    public BusinessDetails convert(BusinessDetailCommand source) {
        if(source ==null){
            return null;
        }
        BusinessDetails businessDetails = new BusinessDetails();
        businessDetails.setAddress1(source.getAddress1());
        businessDetails.setAddress2(source.getAddress2());
        businessDetails.setEmail(source.getEmail());
        businessDetails.setEmail2(source.getEmail2());
        businessDetails.setLogoDir(source.getLogoDir());
        businessDetails.setName(source.getName());
        businessDetails.setPhone1(source.getPhone1());
        businessDetails.setPhone2(source.getPhone2());

        return businessDetails;
    }
}
