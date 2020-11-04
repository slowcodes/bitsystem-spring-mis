package ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeCommandToSalesPriceCode;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class BBTxnDetailCommandToBBTxnDetail implements
        Converter<BloodBankTransactionDetailCommand, BloodbankTransactionDetails> {

    private SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode;
    @Nullable
    @Override
    public BloodbankTransactionDetails convert(BloodBankTransactionDetailCommand source) {
        if(source==null)
            return null;
        final BloodbankTransactionDetails bloodbankTransactionDetails=new BloodbankTransactionDetails();
        bloodbankTransactionDetails.setId(source.getId());

        if(source.getBloodBankTransactionId()!=null){
            BloodbankTransaction bloodbankTransaction = new BloodbankTransaction();
            bloodbankTransaction.setId(source.getBloodBankTransactionId());
            bloodbankTransactionDetails.setBloodbanktransaction(bloodbankTransaction);
            BloodbankTransaction bloodbankTransactions = bloodbankTransaction.addBBTxnDetails(bloodbankTransactionDetails);
        }

        if(source.getStorageId()!=null){
            Storage storage = new Storage();
            storage.setId(source.getStorageId());
            bloodbankTransactionDetails.setStorage(storage);
            storage.addBBTransactionDetail(bloodbankTransactionDetails);
        }

        bloodbankTransactionDetails.setComment(source.getComment());
        bloodbankTransactionDetails.setReversal(source.getReversal());
        bloodbankTransactionDetails.setTimeOfTransaction(source.getTimeOfTransaction());
        bloodbankTransactionDetails.setTransactionDate(source.getDateOfTransaction());
        bloodbankTransactionDetails.setSalesPriceCode(salesPriceCodeCommandToSalesPriceCode.convert(source.getSalesPriceCodeCommand()));
        bloodbankTransactionDetails.setUseDiscountPrice(source.getUseDiscountPrice());
        bloodbankTransactionDetails.setUserDiscount(source.getUserDiscount());

        return bloodbankTransactionDetails;

    }
}
