package ng.com.bitsystems.mis.converters.transaction.otherservice;

import ng.com.bitsystems.mis.command.transactions.otherservice.OtherServiceTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionToTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.otherservices.OtherServiceTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OtherSrvTxnToOtherSrvTxnCommand implements Converter<OtherServiceTransaction, OtherServiceTransactionCommand> {
    private TransactionToTransactionCommand transactionToTransactionCommand;
    private OtherSrvTxnDetailToOtherSrvTxnDetailCommand otherSrvTxnDetailToOtherSrvTxnDetailCommand;

    public OtherSrvTxnToOtherSrvTxnCommand(TransactionToTransactionCommand transactionToTransactionCommand,
                                           OtherSrvTxnDetailToOtherSrvTxnDetailCommand otherSrvTxnDetailToOtherSrvTxnDetailCommand) {
        this.transactionToTransactionCommand = transactionToTransactionCommand;
        this.otherSrvTxnDetailToOtherSrvTxnDetailCommand = otherSrvTxnDetailToOtherSrvTxnDetailCommand;
    }

    @Override
    public OtherServiceTransactionCommand convert(OtherServiceTransaction source) {
        if(source==null)
            return null;

        final OtherServiceTransactionCommand command = new OtherServiceTransactionCommand();
        command.setId(source.getId());

        if(source.getPatients()!=null)
            command.setPatientId(source.getPatients().getId());

        if(source.getReferral()!=null)
            command.setReferralId(source.getReferral().getId());

        command.setTransactionCommand(transactionToTransactionCommand.convert(source.getTransaction()));

        if(source.getOtherServiceTransactionsDetails().size()>0 && source.getOtherServiceTransactionsDetails()!=null)
            source.getOtherServiceTransactionsDetails().forEach(service ->
                    command.getOtherServiceTransactionDetailsCommands().add(
                            otherSrvTxnDetailToOtherSrvTxnDetailCommand.convert(service)
                    ));
        return command;
    }
}
