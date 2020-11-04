package ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeToSalesPriceCodeCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class BBTxnDetailToBBTxnDetailCommand implements
        Converter<BloodbankTransactionDetails, BloodBankTransactionDetailCommand> {
    private SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand;

    public BBTxnDetailToBBTxnDetailCommand(SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand) {
        this.salesPriceCodeToSalesPriceCodeCommand = salesPriceCodeToSalesPriceCodeCommand;
    }

    @Nullable
    @Override
    public BloodBankTransactionDetailCommand convert(BloodbankTransactionDetails source) {
        if(source==null)
            return null;
        final BloodBankTransactionDetailCommand command=new BloodBankTransactionDetailCommand();
        command.setId(source.getId());

        if(source.getBloodbanktransaction()!=null){
            command.setBloodBankTransactionId(source.getBloodbanktransaction().getId());
        }

        if(source.getStorage()!=null){
            command.setStorageId(source.getStorage().getId());
        }

        command.setComment(source.getComment());
        command.setReversal(source.getReversal());
        command.setTimeOfTransaction(source.getTimeOfTransaction());
        command.setDateOfTransaction(source.getTransactionDate());
        command.setSalesPriceCodeCommand(salesPriceCodeToSalesPriceCodeCommand.convert(source.getSalesPriceCode()));
        command.setUseDiscountPrice(source.getUseDiscountPrice());
        command.setUserDiscount(source.getUserDiscount());

        return command;
    }
}
