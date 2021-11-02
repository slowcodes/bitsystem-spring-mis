package ng.com.bitsystems.mis.converters.transaction;

import ng.com.bitsystems.mis.command.transactions.ServiceTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ServiceTxnToServiceTxnCommand implements Converter<ServiceTransaction, ServiceTransactionCommand> {
    private TransactionToTransactionCommand transactionToTransactionCommand;

    public ServiceTxnToServiceTxnCommand(TransactionToTransactionCommand transactionToTransactionCommand) {
        this.transactionToTransactionCommand = transactionToTransactionCommand;
    }

    @Override
    public ServiceTransactionCommand convert(ServiceTransaction source) {

        if(source==null)
            return null;

        ServiceTransactionCommand command = new ServiceTransactionCommand();
        command.setId(source.getId());
        command.setReferralId(source.getReferral().getId());
        command.setTransactionCommand(transactionToTransactionCommand.convert(source.getTransaction()));
        if(source.getPatients() !=null)
            command.setPatientId(source.getPatients().getId());
        command.setUserDiscount(source.getUserDiscount());
        return command;
    }
}
