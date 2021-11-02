package ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class BBTxnToBBTxnCommand implements Converter<BloodbankTransaction, BloodBankTransactionCommand> {
    private BBTxnDetailToBBTxnDetailCommand bbTxnDetailToBBTxnDetailCommand;
    @Nullable
    @Override
    public BloodBankTransactionCommand convert(BloodbankTransaction source) {
        if(source==null)
            return null;

        final BloodBankTransactionCommand command=new BloodBankTransactionCommand();

        if(source.getBloodbankTransactionDetails()!=null && source.getBloodbankTransactionDetails().size()>0)
            source.getBloodbankTransactionDetails().forEach(bloodBankTransactionDetailCommand ->
                    command.getBloodBankTransactionDetailCommands().add(
                            bbTxnDetailToBBTxnDetailCommand.convert(bloodBankTransactionDetailCommand)
                    ));


//        if(source.getPatients()!=null){
//            command.setPatientId(source.getPatients().getId());
//        }

        return command;
    }
}
