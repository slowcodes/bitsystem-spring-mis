package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionCommandToTransaction;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuranceTransactions;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InsuredTransactionCommandToInsuredTransaction implements Converter<InsuredTransactionCommand, InsuranceTransactions> {
    private ProgramCommandToProgram programCommandToProgram;
    private TransactionCommandToTransaction transactionCommandToTransaction;

    public InsuredTransactionCommandToInsuredTransaction(ProgramCommandToProgram programCommandToProgram,
                                                         TransactionCommandToTransaction transactionCommandToTransaction) {
        this.programCommandToProgram = programCommandToProgram;
        this.transactionCommandToTransaction = transactionCommandToTransaction;
    }

    @Override
    public InsuranceTransactions convert(InsuredTransactionCommand source) {

        final InsuranceTransactions transactions = new InsuranceTransactions();

        if(source==null){
            return null;
        }
        transactions.setId(source.getId());
        transactions.setPrograms(programCommandToProgram.convert(source.getProgramsCommand()));
        transactions.setTransaction(transactionCommandToTransaction.convert(source.getTransactionCommand()));
        transactions.setPercentageIncured(source.getPercentageIncured());

        return transactions;
    }
}