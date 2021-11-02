package ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class BBTxnCommandToBBTxn implements Converter<BloodBankTransactionCommand, BloodbankTransaction> {
    private BBTxnDetailCommandToBBTxnDetail bbTxnDetailCommandToBBTxnDetail;

    @Nullable
    @Override
    public BloodbankTransaction convert(BloodBankTransactionCommand source) {
        if(source==null)
            return null;

        final BloodbankTransaction transaction=new BloodbankTransaction();


        if(source.getBloodBankTransactionDetailCommands()!=null && source.getBloodBankTransactionDetailCommands().size()>0)
            source.getBloodBankTransactionDetailCommands().forEach(bloodBankTransactionDetailCommand ->
                    transaction.getBloodbankTransactionDetails().add(
                            bbTxnDetailCommandToBBTxnDetail.convert(bloodBankTransactionDetailCommand)
                    ));


        return transaction;
    }
}
