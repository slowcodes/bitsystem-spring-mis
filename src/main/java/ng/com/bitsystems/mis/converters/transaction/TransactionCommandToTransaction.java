package ng.com.bitsystems.mis.converters.transaction;

import ng.com.bitsystems.mis.command.transactions.TransactionCommand;
import ng.com.bitsystems.mis.models.transactions.Transaction;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TransactionCommandToTransaction implements Converter<TransactionCommand, Transaction> {

    @Override
    public Transaction convert(TransactionCommand source) {

        if(source==null)
            return null;

        final Transaction transaction= new Transaction();
        transaction.setId(source.getId());
        transaction.setComment(source.getComment());
        transaction.setTimeOfTransaction(source.getTimeOfTransaction());
        transaction.setDateTransaction(source.getDateTransaction());
        transaction.setDiscount(source.getDiscount());

        if(source.getUserId()!=null){
            AppUsers appUsers = new AppUsers();
            appUsers.setId(source.getUserId());
            transaction.setAppUsers(appUsers);
            AppUsers user = appUsers.addTransaction(transaction);
        }


        return transaction;
    }
}
