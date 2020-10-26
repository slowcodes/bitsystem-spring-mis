package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredLaboratoryTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnToLabTxnCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredLaboratoryTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredLabTxnToInsuredLabTxnCmd implements Converter<InsuredLaboratoryTransactions, InsuredLaboratoryTransactionCommand> {

    private LabTxnToLabTxnCommand labTxnToLabTxnCommand;
    private ProgramToProgramCommand programToProgramCommand;

    public InsuredLabTxnToInsuredLabTxnCmd(LabTxnToLabTxnCommand labTxnToLabTxnCommand, ProgramToProgramCommand programToProgramCommand) {
        this.labTxnToLabTxnCommand = labTxnToLabTxnCommand;
        this.programToProgramCommand = programToProgramCommand;
    }

    @Override
    public InsuredLaboratoryTransactionCommand convert(InsuredLaboratoryTransactions source) {
        if(source == null){
            return null;
        }
        final InsuredLaboratoryTransactionCommand transactionCommand = new InsuredLaboratoryTransactionCommand();

        transactionCommand.setId(source.getId());
        transactionCommand.setLaboratoryTransactionCommand(labTxnToLabTxnCommand.convert(source.getLaboratoryTransaction()));
        transactionCommand.setPercentageIncurred(source.getPercentageIncured());
        transactionCommand.setProgram(programToProgramCommand.convert(source.getPrograms()));

        return transactionCommand;
    }
}
