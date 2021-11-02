package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.converters.transaction.TransactionCommandToTransaction;
import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OtherServiceCommandToOtherService implements Converter<OtherServiceCommand, OtherServices> {

    private ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode;
    private TransactionCommandToTransaction transactionCommandToTransaction;

    public OtherServiceCommandToOtherService(ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode,
                                             TransactionCommandToTransaction transactionCommandToTransaction) {
        this.servicePriceCodeCommandToServicePriceCode = servicePriceCodeCommandToServicePriceCode;
        this.transactionCommandToTransaction = transactionCommandToTransaction;
    }

    @Override
    public OtherServices convert(OtherServiceCommand source) {
        if(source==null){
            return null;
        }
        OtherServices otherServices = new OtherServices();
        otherServices.setId(source.getId());

        if(source.getCreatedById() != null){
            AppUsers user = new AppUsers();
            user.setId(source.getId());
            otherServices.setCreatedBy(user);
            AppUsers usr = user.addOtherServiceCreator(otherServices);
        }
        otherServices.setDescription(source.getDescription());

        if(source.getExpenseBooksId() !=null){
            AccountBooks accountBooks = new AccountBooks();
            accountBooks.setId(source.getExpenseBooksId());
            otherServices.setAccountBook(accountBooks);
            accountBooks.addOtherService(otherServices);
        }

        otherServices.setDescription(source.getDescription());

        otherServices.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
        otherServices.setTimeOfTransaction(source.getTimeOfTransaction());

        return otherServices;
    }
}
