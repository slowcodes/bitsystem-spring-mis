package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredVaccinationTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.vaccination.VaccTxnToVaccTxnCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredVaccinationTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredVaccTxnToInsuredVaccTxnCmd implements Converter<InsuredVaccinationTransactions, InsuredVaccinationTransactionCommand> {

    private ProgramToProgramCommand programToProgramCommand;
    private VaccTxnToVaccTxnCommand vaccTxnToVaccTxnCommand;

    public InsuredVaccTxnToInsuredVaccTxnCmd(ProgramToProgramCommand programToProgramCommand, VaccTxnToVaccTxnCommand vaccTxnToVaccTxnCommand) {
        this.programToProgramCommand = programToProgramCommand;
        this.vaccTxnToVaccTxnCommand = vaccTxnToVaccTxnCommand;
    }

    @Override
    public InsuredVaccinationTransactionCommand convert(InsuredVaccinationTransactions source) {


        if(source==null){
            return null;
        }
        final InsuredVaccinationTransactionCommand transactionCommand = new InsuredVaccinationTransactionCommand();

        transactionCommand.setId(source.getId());
        transactionCommand.setPercentageIncurred(source.getPercentageIncured());
        transactionCommand.setProgramsCommand(programToProgramCommand.convert(source.getPrograms()));
        transactionCommand.setVaccinationTransactionCommand(vaccTxnToVaccTxnCommand.convert(source.getVaccinationTransaction()));

        return transactionCommand;
    }
}
