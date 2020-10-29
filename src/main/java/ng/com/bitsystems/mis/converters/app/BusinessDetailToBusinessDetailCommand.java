package ng.com.bitsystems.mis.converters.app;

import ng.com.bitsystems.mis.command.app.BusinessDetailCommand;
import ng.com.bitsystems.mis.models.app.BusinessDetails;
import org.springframework.core.convert.converter.Converter;

public class BusinessDetailToBusinessDetailCommand implements Converter<BusinessDetails, BusinessDetailCommand> {
    @Override
    public BusinessDetailCommand convert(BusinessDetails source) {
        if(source==null){
            return null;
        }
        BusinessDetailCommand businessDetailCommand=new BusinessDetailCommand();
        businessDetailCommand.setAddress1(source.getAddress1());
        businessDetailCommand.setAddress2(source.getAddress2());
        businessDetailCommand.setEmail(source.getEmail());
        businessDetailCommand.setEmail2(source.getEmail2());
        businessDetailCommand.setLogoDir(source.getLogoDir());
        businessDetailCommand.setName(source.getName());
        businessDetailCommand.setPhone1(source.getPhone1());
        businessDetailCommand.setPhone2(source.getPhone2());

        return businessDetailCommand;
    }
}
