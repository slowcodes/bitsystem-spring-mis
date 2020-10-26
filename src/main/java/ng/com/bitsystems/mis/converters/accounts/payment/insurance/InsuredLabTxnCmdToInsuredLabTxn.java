package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredLaboratoryTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnCommandToLabTxn;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredLaboratoryTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredLabTxnCmdToInsuredLabTxn implements Converter<InsuredLaboratoryTransactionCommand, InsuredLaboratoryTransactions> {

    private LabTxnCommandToLabTxn labTxnCmd2LabTxn;
    private ProgramCommandToProgram programCommandToProgram;

    public InsuredLabTxnCmdToInsuredLabTxn(LabTxnCommandToLabTxn labTxnCmd2LabTxn,
                                           ProgramCommandToProgram programCommandToProgram) {
        this.labTxnCmd2LabTxn = labTxnCmd2LabTxn;
        this.programCommandToProgram = programCommandToProgram;
    }

    @Override
    public InsuredLaboratoryTransactions convert(InsuredLaboratoryTransactionCommand source) {

        if(source==null){
            return null;
        }
        final InsuredLaboratoryTransactions laboratoryTransactions = new InsuredLaboratoryTransactions();

        laboratoryTransactions.setId(source.getId());
        laboratoryTransactions.setLaboratoryTransaction(labTxnCmd2LabTxn.convert(source.getLaboratoryTransactionCommand()));
        laboratoryTransactions.setPercentageIncured(source.getPercentageIncurred());
        laboratoryTransactions.setPrograms(programCommandToProgram.convert(source.getProgram()));

        return laboratoryTransactions;
    }
}
