package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredPharmacyTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSaleTxnToPharmSalesTxnCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSalesTxnCommandToPharmSaleTxn;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredPharmacyTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredPharmTxnCmdToInsuredPharmTxn implements Converter<InsuredPharmacyTransactionCommand, InsuredPharmacyTransactions> {

    private ProgramCommandToProgram programCommandToProgram;
    private PharmSalesTxnCommandToPharmSaleTxn pharmSalesTxnCommandToPharmSaleTxn;

    public InsuredPharmTxnCmdToInsuredPharmTxn(ProgramCommandToProgram programCommandToProgram, PharmSaleTxnToPharmSalesTxnCommand pharmSaleTxnToPharmSalesTxnCommand) {
        this.programCommandToProgram = programCommandToProgram;
        this.pharmSalesTxnCommandToPharmSaleTxn = pharmSalesTxnCommandToPharmSaleTxn;
    }

    @Override
    public InsuredPharmacyTransactions convert(InsuredPharmacyTransactionCommand source) {
        if(source==null){
            return null;
        }
        final InsuredPharmacyTransactions insuredPharmacyTransactions = new InsuredPharmacyTransactions();
        insuredPharmacyTransactions.setId(insuredPharmacyTransactions.getId());
        insuredPharmacyTransactions.setPharmacySalesTransaction(pharmSalesTxnCommandToPharmSaleTxn.convert(source.getPharmacySalesTransactionCommand()));
        insuredPharmacyTransactions.setPrograms(programCommandToProgram.convert(source.getProgramsCommand()));
        return insuredPharmacyTransactions;
    }
}
