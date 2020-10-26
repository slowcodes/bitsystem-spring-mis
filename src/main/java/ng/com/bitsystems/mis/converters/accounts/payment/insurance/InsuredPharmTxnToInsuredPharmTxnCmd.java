package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredPharmacyTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSaleTxnToPharmSalesTxnCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredPharmacyTransactions;
import org.springframework.core.convert.converter.Converter;


public class InsuredPharmTxnToInsuredPharmTxnCmd implements Converter<InsuredPharmacyTransactions, InsuredPharmacyTransactionCommand> {

    private PharmSaleTxnToPharmSalesTxnCommand pharmSaleTxnToPharmSalesTxnCommand;
    private ProgramToProgramCommand programToProgramCommand;

    public InsuredPharmTxnToInsuredPharmTxnCmd(PharmSaleTxnToPharmSalesTxnCommand pharmSaleTxnToPharmSalesTxnCommand,
                                               ProgramToProgramCommand programToProgramCommand) {
        this.pharmSaleTxnToPharmSalesTxnCommand = pharmSaleTxnToPharmSalesTxnCommand;
        this.programToProgramCommand = programToProgramCommand;
    }

    @Override
    public InsuredPharmacyTransactionCommand convert(InsuredPharmacyTransactions source) {
        if(source==null){
            return null;
        }

        final InsuredPharmacyTransactionCommand insuredPharmacyTransactionCommand = new InsuredPharmacyTransactionCommand();
        insuredPharmacyTransactionCommand.setId(insuredPharmacyTransactionCommand.getId());
        insuredPharmacyTransactionCommand.setPercentageIncurred(source.getPercentageIncured());
        insuredPharmacyTransactionCommand.setPharmacySalesTransactionCommand(pharmSaleTxnToPharmSalesTxnCommand.convert(source.getPharmacySalesTransaction()));
        insuredPharmacyTransactionCommand.setProgramsCommand(programToProgramCommand.convert(source.getPrograms()));

        return insuredPharmacyTransactionCommand;
    }
}
