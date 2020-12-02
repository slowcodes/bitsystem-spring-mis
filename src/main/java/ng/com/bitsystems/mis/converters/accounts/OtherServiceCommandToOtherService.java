package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceCommandToOtherService implements Converter<OtherServiceCommand, OtherServices> {

    private ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode;

    public OtherServiceCommandToOtherService(ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode) {
        this.servicePriceCodeCommandToServicePriceCode = servicePriceCodeCommandToServicePriceCode;
    }

    @Override
    public OtherServices convert(OtherServiceCommand source) {
        if(source==null){
            return null;
        }
        OtherServices otherServices = new OtherServices();
        otherServices.setId(source.getId());
        if(source.getCreatedById() != null){
            Users user = new Users();
            user.setId(source.getId());
            otherServices.setCreatedBy(user);
            Users usr = user.addOtherServiceCreator(otherServices);
        }
        otherServices.setDescription(source.getDescription());
        if(source.getExpenseBooksId() !=null){
            AccountBooks accountBooks = new AccountBooks();
            accountBooks.setId(source.getExpenseBooksId());
            otherServices.setAccountBook(accountBooks);
            accountBooks.addOtherService(otherServices);
        }
        otherServices.setComment(source.getComment());
        otherServices.setDescription(source.getDescription());
        otherServices.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
        otherServices.setFrequency(otherServices.getFrequency());
        otherServices.setReversal(otherServices.getReversal());
        otherServices.setTimeOfTransaction(source.getTimeOfTransaction());
        otherServices.setUseDiscountPrice(source.getUseDiscountPrice());
        otherServices.setUseDiscountPrice(otherServices.getUserDiscount());
        return otherServices;
    }
}
