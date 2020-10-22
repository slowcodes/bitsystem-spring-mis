package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredBloodBankTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnCommandToBBTxn;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredBloodbankTransactions;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.Programs;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class InsuredBBTxnCmdToInsuredBBTxn implements
        Converter<InsuredBloodBankTransactionCommand, InsuredBloodbankTransactions> {

    private BBTxnCommandToBBTxn bbTxnCommandToBBTxn;

    public InsuredBBTxnCmdToInsuredBBTxn(BBTxnCommandToBBTxn bbTxnCommandToBBTxn) {
        this.bbTxnCommandToBBTxn = bbTxnCommandToBBTxn;
    }

    @Override
    @Nullable
    public InsuredBloodbankTransactions convert(InsuredBloodBankTransactionCommand source) {
        if(source==null)
            return null;

        final InsuredBloodbankTransactions insuredBloodbankTransactions = new InsuredBloodbankTransactions();
        insuredBloodbankTransactions.setId(source.getId());
        insuredBloodbankTransactions.setPercentageIncured(source.getPercentageIncurred());

        if(source.getProgramCommandId()!=null){
            Programs programs = new Programs();
            programs.setId(source.getProgramCommandId());
            insuredBloodbankTransactions.setPrograms(programs);
            programs.addInsuredTransaction(insuredBloodbankTransactions);
        }
        insuredBloodbankTransactions.setBloodbankTransaction(bbTxnCommandToBBTxn.convert(source.getBloodBankTransactionCommand()));
        return insuredBloodbankTransactions;
    }
}
