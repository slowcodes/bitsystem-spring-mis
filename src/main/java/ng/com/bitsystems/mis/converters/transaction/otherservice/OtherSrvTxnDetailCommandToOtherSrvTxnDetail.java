package ng.com.bitsystems.mis.converters.transaction.otherservice;


import ng.com.bitsystems.mis.command.transactions.otherservice.OtherServiceTransactionDetailsCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceCommandToOtherService;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.models.transactions.otherservices.OtherServiceTransaction;
import ng.com.bitsystems.mis.models.transactions.otherservices.OtherServiceTransactionTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OtherSrvTxnDetailCommandToOtherSrvTxnDetail implements Converter<OtherServiceTransactionDetailsCommand, OtherServiceTransactionTransactionDetails> {
    private ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode;
    private OtherServiceCommandToOtherService otherServiceCommandToOtherService;

    public OtherSrvTxnDetailCommandToOtherSrvTxnDetail(ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode,
                                                       OtherServiceCommandToOtherService otherServiceCommandToOtherService) {
        this.servicePriceCodeCommandToServicePriceCode = servicePriceCodeCommandToServicePriceCode;
        this.otherServiceCommandToOtherService = otherServiceCommandToOtherService;
    }

    @Override
    public OtherServiceTransactionTransactionDetails convert(OtherServiceTransactionDetailsCommand source) {

        if(source==null)
            return null;

        OtherServiceTransactionTransactionDetails otherServiceTransactionDetails = new OtherServiceTransactionTransactionDetails();
        otherServiceTransactionDetails.setId(source.getId());

        if(source.getOtherServiceTransactionId()!=null){
            OtherServiceTransaction otherServiceTransaction = new OtherServiceTransaction();
            otherServiceTransaction.setId(source.getOtherServiceTransactionId());
            otherServiceTransactionDetails.setOtherServiceTransaction(otherServiceTransaction);
            OtherServiceTransaction transaction = otherServiceTransaction.addDetail(otherServiceTransactionDetails);
        }

        otherServiceTransactionDetails.setOtherService(otherServiceCommandToOtherService.convert(source.getOtherServiceCommand()));
//        otherServiceTransactionDetails.setComment(source.getComment());
//        otherServiceTransactionDetails.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
//        otherServiceTransactionDetails.setTimeOfTransaction(source.getTimeOfTransaction());
//        otherServiceTransactionDetails.setUseDiscountPrice(source.getUseDiscountPrice());
//        otherServiceTransactionDetails.setUserDiscount(source.getUserDiscount());

        return otherServiceTransactionDetails;
    }
}
