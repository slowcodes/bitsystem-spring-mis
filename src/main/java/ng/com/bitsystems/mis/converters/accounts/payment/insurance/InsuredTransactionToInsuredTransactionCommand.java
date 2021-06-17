package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionToTransactionCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuranceTransactions;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InsuredTransactionToInsuredTransactionCommand implements Converter<InsuranceTransactions,
        InsuredTransactionCommand> {

    private ProgramToProgramCommand programToProgramCommand;
    private TransactionToTransactionCommand transactionToTransactionCommand;

    public InsuredTransactionToInsuredTransactionCommand(ProgramToProgramCommand programToProgramCommand,
                                                         TransactionToTransactionCommand transactionToTransactionCommand) {
        this.programToProgramCommand = programToProgramCommand;
        this.transactionToTransactionCommand = transactionToTransactionCommand;
    }

    @Override
    public InsuredTransactionCommand convert(InsuranceTransactions source) {
        if(source==null){
            return null;
        }

        final InsuredTransactionCommand command = new InsuredTransactionCommand();

        command.setId(command.getId());
        command.setTransactionCommand(transactionToTransactionCommand.convert(source.getTransaction()));
        command.setPercentageIncured(source.getPercentageIncured());
        command.setProgramsCommand(programToProgramCommand.convert(source.getPrograms()));

        return command;
    }
}
