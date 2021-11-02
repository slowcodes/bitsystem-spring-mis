package ng.com.bitsystems.mis.converters.transaction.vaccination;

import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionToTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VaccTxnToVaccTxnCommand implements Converter<VaccinationTransaction, VaccinationTransactionCommand> {
    private TransactionToTransactionCommand transactionToTransactionCommand;

    public VaccTxnToVaccTxnCommand(TransactionToTransactionCommand transactionToTransactionCommand) {
        this.transactionToTransactionCommand = transactionToTransactionCommand;
    }

    @Override
    public VaccinationTransactionCommand convert(VaccinationTransaction source) {

        if(source==null)
            return null;

        final VaccinationTransactionCommand command=new VaccinationTransactionCommand();
        command.setId(source.getId());
        if(source.getPatients()!=null)
            command.setPatientId(source.getPatients().getId());

        if(source.getReferral()!=null)
            command.setReferralId(source.getReferral().getId());

        command.setTransactionCommand(transactionToTransactionCommand.convert(source.getTransaction()));

        return command;
    }
}
