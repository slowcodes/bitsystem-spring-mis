package ng.com.bitsystems.mis.converters.transaction;

import ng.com.bitsystems.mis.command.transactions.TransactionCommand;
import ng.com.bitsystems.mis.models.transactions.Transaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TransactionToTransactionCommand implements Converter<Transaction, TransactionCommand> {
    @Override
    public TransactionCommand convert(Transaction source) {

        if(source==null)
            return null;

        TransactionCommand command = new TransactionCommand();
        command.setId(source.getId());
        command.setComment(source.getComment());
        command.setDateTransaction(source.getDateTransaction());
        command.setDiscount(source.getDiscount());
        command.setTimeOfTransaction(source.getTimeOfTransaction());

        if(source.getAppUsers()!=null){
            command.setUserId(source.getAppUsers().getId());
        }




        return command;
    }
}
