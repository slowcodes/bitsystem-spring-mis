package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class LabTxnToLabTxnCommand implements Converter<LaboratoryTransaction, LaboratoryTransactionCommand> {
    private LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand;

    @Nullable
    @Override
    public LaboratoryTransactionCommand convert(LaboratoryTransaction source) {
        if(source==null){
            return null;
        }

        final LaboratoryTransactionCommand transaction=new LaboratoryTransactionCommand();

        transaction.setComment(source.getComment());
        transaction.setDateTransaction(source.getDateTransaction());
        transaction.setDiscount(source.getDiscount());
        transaction.setId(source.getId());
        transaction.setTimeOfTransaction(source.getTimeOfTransaction());
        transaction.setProvisionalDiagnosis(source.getProvisonalDiagnosis());
        transaction.setPresentingComplaint(source.getPresentingComplaint());

        if(source.getLaboratoryTransactionDetails()!=null && source.getLaboratoryTransactionDetails().size()>0)
            source.getLaboratoryTransactionDetails().forEach(laboratoryTransactionDetailCommand ->
                    transaction.getLaboratoryTransactionDetailCommands().add(
                            labTxnDetailToLabTxnDetailCommand.convert(laboratoryTransactionDetailCommand)
                    ));

        if(source.getUsers()!= null){
            transaction.setUserId(source.getUsers().getId());
        }

        if(source.getPatients()!=null){
            transaction.setPatientId(source.getPatients().getId());
        }

        return null;
    }
}
