package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.SalesCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionToTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.Sales;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SalesToSalesCommand implements Converter<Sales, SalesCommand> {
    private TransactionToTransactionCommand transactionToTransactionCommand;

    public SalesToSalesCommand(TransactionToTransactionCommand transactionToTransactionCommand) {
        this.transactionToTransactionCommand =transactionToTransactionCommand;
    }

    @Override
    public SalesCommand convert(Sales source) {

        if(source == null){
            return null;
        }

        SalesCommand command = new SalesCommand();
        command.setId(source.getId());
        if(source.getPatients().getId()!=null){
            command.setPatientId(source.getPatients().getId());
        }

        if(source.getReferral().getId() != null){
            command.setReferralId(source.getReferral().getId());
        }

        command.setTransactionCommand(transactionToTransactionCommand.convert(source.getTransaction()));
        return command;
    }
}
