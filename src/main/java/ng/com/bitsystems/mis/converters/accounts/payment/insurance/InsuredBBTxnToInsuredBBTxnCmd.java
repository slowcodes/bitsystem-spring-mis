package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredBloodBankTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnToBBTxnCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredBloodbankTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredBBTxnToInsuredBBTxnCmd implements Converter<InsuredBloodbankTransactions, InsuredBloodBankTransactionCommand> {

    private BBTxnToBBTxnCommand bbTxnToBBTxnCommand;
    public InsuredBBTxnToInsuredBBTxnCmd(BBTxnToBBTxnCommand bbTxnToBBTxnCommand) {
        this.bbTxnToBBTxnCommand = bbTxnToBBTxnCommand;
    }


    @Override
    public InsuredBloodBankTransactionCommand convert(InsuredBloodbankTransactions source) {

        final InsuredBloodBankTransactionCommand insuredBloodBankTransactionCommand = new InsuredBloodBankTransactionCommand();
        if(source.getId() != null) {
            insuredBloodBankTransactionCommand.setProgramCommandId(source.getBloodbankTransaction().getId());
        }
        insuredBloodBankTransactionCommand.setId(source.getId());
        insuredBloodBankTransactionCommand.setPercentageIncurred(source.getPercentageIncured());
        insuredBloodBankTransactionCommand.setBloodBankTransactionCommand(bbTxnToBBTxnCommand.convert(source.getBloodbankTransaction()));
        return null;
    }
}
