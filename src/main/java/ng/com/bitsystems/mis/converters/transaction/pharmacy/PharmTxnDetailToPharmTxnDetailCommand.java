package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacyTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class PharmTxnDetailToPharmTxnDetailCommand implements Converter<PharmacyTransactionDetails, PharmacyTransactionDetailCommand> {
    private AdditionTnxDetailToAdditionalTxnDetailCommand additionTnxDetailToAdditionalTxnDetailCommand;

    public PharmTxnDetailToPharmTxnDetailCommand(AdditionTnxDetailToAdditionalTxnDetailCommand additionTnxDetailToAdditionalTxnDetailCommand
                                                 ) {
        this.additionTnxDetailToAdditionalTxnDetailCommand = additionTnxDetailToAdditionalTxnDetailCommand;
    }

    @Nullable
    @Override
    public PharmacyTransactionDetailCommand convert(PharmacyTransactionDetails source) {

        if(source==null)
            return null;

        final PharmacyTransactionDetailCommand command = new PharmacyTransactionDetailCommand();
        command.setId(source.getId());

        if(source.getPharmacyProducts()!=null){
            command.setPharmacyProductId(source.getPharmacyProducts().getId());
        }

        if(source.getAdditionalTransactionDetails().size()>0 && source.getAdditionalTransactionDetails()!=null)
            source.getAdditionalTransactionDetails().forEach(additionalTransactionDetail ->
                    command.getAdditionalTransactionDetailCommands().add(
                            additionTnxDetailToAdditionalTxnDetailCommand.convert(
                                    additionalTransactionDetail
                            )
                    ));

        if(source.getTransaction()!=null){
            command.setTransactionId(source.getTransaction().getId());
        }

//        command.setComment(source.getComment());
//        command.setReversal(source.getReversal());
//        command.setSalesPriceCodeCommand(salesPriceCodeToSalesPriceCodeCommand.convert(source.getSalesPriceCode()));
        //command.setTimeOfTransaction(source.getTimeOfTransaction());
        //command.getTimeOfTransaction(source.getTimeOfTransaction());
//        command.setUseDiscountPrice(source.getUseDiscountPrice());
//        command.setUserDiscount(source.getUserDiscount());


        return command;
    }
}
