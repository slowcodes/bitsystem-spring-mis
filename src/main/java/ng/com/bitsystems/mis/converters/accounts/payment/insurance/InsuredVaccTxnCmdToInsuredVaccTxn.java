package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredVaccinationTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.vaccination.VaccTxnCommandToVaccTxn;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredVaccinationTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredVaccTxnCmdToInsuredVaccTxn implements Converter<InsuredVaccinationTransactionCommand, InsuredVaccinationTransactions> {
    private ProgramCommandToProgram programCommandToProgram;
    private VaccTxnCommandToVaccTxn vaccTxnCommandToVaccTxn;

    public InsuredVaccTxnCmdToInsuredVaccTxn(ProgramCommandToProgram programCommandToProgram,
                                             VaccTxnCommandToVaccTxn vaccTxnCommandToVaccTxn) {
        this.programCommandToProgram = programCommandToProgram;
        this.vaccTxnCommandToVaccTxn = vaccTxnCommandToVaccTxn;
    }

    @Override
    public InsuredVaccinationTransactions convert(InsuredVaccinationTransactionCommand source) {

        final InsuredVaccinationTransactions vaccinationTransactions = new InsuredVaccinationTransactions();

        if(source==null){
            return null;
        }
        vaccinationTransactions.setId(source.getId());
        vaccinationTransactions.setPrograms(programCommandToProgram.convert(source.getProgramsCommand()));
        vaccinationTransactions.setVaccinationTransaction(vaccTxnCommandToVaccTxn.convert(source.getVaccinationTransactionCommand()));
        vaccinationTransactions.setPercentageIncured(source.getPercentageIncurred());

        return vaccinationTransactions;
    }
}
