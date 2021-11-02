package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.converters.consultation.DiseaseDirectoryToDiseaseDirectoryCommand;
import ng.com.bitsystems.mis.converters.consultation.SymptomsDirectoryToSymtomsDirectoryCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LabTxnToLabTxnCommand implements Converter<LaboratoryTransaction, LaboratoryTransactionCommand> {
    private LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand;
    private DiseaseDirectoryToDiseaseDirectoryCommand diseaseDirectoryToDiseaseDirectoryCommand;
    private SymptomsDirectoryToSymtomsDirectoryCommand symptomsDirectoryToSymtomsDirectoryCommand;

    public LabTxnToLabTxnCommand(LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand,
                                 DiseaseDirectoryToDiseaseDirectoryCommand diseaseDirectoryToDiseaseDirectoryCommand,
                                 SymptomsDirectoryToSymtomsDirectoryCommand symptomsDirectoryToSymtomsDirectoryCommand) {
        this.labTxnDetailToLabTxnDetailCommand = labTxnDetailToLabTxnDetailCommand;
        this.diseaseDirectoryToDiseaseDirectoryCommand = diseaseDirectoryToDiseaseDirectoryCommand;
        this.symptomsDirectoryToSymtomsDirectoryCommand = symptomsDirectoryToSymtomsDirectoryCommand;
    }

    @Nullable
    @Override
    public LaboratoryTransactionCommand convert(LaboratoryTransaction source) {
        if(source==null){
            return null;
        }

        final LaboratoryTransactionCommand transaction=new LaboratoryTransactionCommand();

        transaction.setId(source.getId());
        //transaction.setNote(source.getNote());
        //transaction.setTimeOfTransaction(source.getTimeOfTransaction());

        if(source.getProvisional_diagnosis().size()>0 && source.getProvisional_diagnosis()!=null)
            source.getProvisional_diagnosis().forEach(provisional_diagnosis -> {
                transaction.getProvisionalDiagnosis().add(diseaseDirectoryToDiseaseDirectoryCommand.convert(provisional_diagnosis));
            });

        if(source.getSymptoms().size()>0 && source.getSymptoms() !=null)
            source.getSymptoms().forEach(symptom -> symptomsDirectoryToSymtomsDirectoryCommand.convert(symptom));

        if(source.getLaboratoryTransactionDetails()!=null && source.getLaboratoryTransactionDetails().size()>0)
            source.getLaboratoryTransactionDetails().forEach(laboratoryTransactionDetailCommand ->
                    transaction.getLaboratoryTransactionDetailCommands().add(
                            labTxnDetailToLabTxnDetailCommand.convert(laboratoryTransactionDetailCommand)
                    ));
        if(source.getServiceTransaction().getId()!=null)
            transaction.setServiceTxnId(source.getServiceTransaction().getId());
        transaction.setAgeInResult(source.getAgeInResult());
        transaction.setAnonymous(source.getAnonymous());
        return transaction;
    }
}
