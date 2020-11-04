package ng.com.bitsystems.mis.converters.transaction.vaccination;

import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import org.springframework.core.convert.converter.Converter;

public class VaccTxnToVaccTxnCommand implements Converter<VaccinationTransaction, VaccinationTransactionCommand> {

    @Override
    public VaccinationTransactionCommand convert(VaccinationTransaction source) {

        if(source==null)
            return null;

        final VaccinationTransactionCommand command=new VaccinationTransactionCommand();
        command.setComment(source.getComment());
        command.setDateTransaction(source.getDateTransaction());
        command.setDiscount(source.getDiscount());
        command.setId(source.getId());
        command.setTimeOfTransaction(source.getTimeOfTransaction());

        if(source.getUsers()!= null){
            command.setUserId(source.getUsers().getId());
        }

        if(source.getPatients()!=null){
            command.setPatientId(source.getUsers().getId());
        }

        return command;
    }
}
