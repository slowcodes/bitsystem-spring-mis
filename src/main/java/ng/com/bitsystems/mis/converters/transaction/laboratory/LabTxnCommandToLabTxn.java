package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.converters.consultation.DiseaseDirectoryCommandToDiseaseDirectory;
import ng.com.bitsystems.mis.converters.consultation.SymptomsDirectoryCommandToSymptomsDirectory;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LabTxnCommandToLabTxn implements Converter<LaboratoryTransactionCommand, LaboratoryTransaction> {

    private LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail;
    private SymptomsDirectoryCommandToSymptomsDirectory symptomsDirectoryCommandToSymptomsDirectory;
    private DiseaseDirectoryCommandToDiseaseDirectory diseaseDirectoryCommandToDiseaseDirectory;

    public LabTxnCommandToLabTxn(LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail,
                                 SymptomsDirectoryCommandToSymptomsDirectory symptomsDirectoryCommandToSymptomsDirectory,
                                 DiseaseDirectoryCommandToDiseaseDirectory diseaseDirectoryCommandToDiseaseDirectory) {
        this.labTxnDetailCommandToLabTxnDetail = labTxnDetailCommandToLabTxnDetail;
        this.symptomsDirectoryCommandToSymptomsDirectory = symptomsDirectoryCommandToSymptomsDirectory;
        this.diseaseDirectoryCommandToDiseaseDirectory = diseaseDirectoryCommandToDiseaseDirectory;
    }

    @Override
    @Nullable
    public LaboratoryTransaction convert(LaboratoryTransactionCommand source) {

        if(source==null){
            return null;
        }

        final LaboratoryTransaction transaction=new LaboratoryTransaction();
        transaction.setId(source.getId());

        if(source.getPresentingComplaints().size() >0 && source.getPresentingComplaints() !=null)
            source.getPresentingComplaints().forEach(presentingComplaints -> transaction.getSymptoms().add(
                    symptomsDirectoryCommandToSymptomsDirectory.convert(presentingComplaints)
            ));

        if(source.getProvisionalDiagnosis() !=null && source.getProvisionalDiagnosis().size()>0)
            source.getProvisionalDiagnosis().forEach(provisional_diagnosis -> diseaseDirectoryCommandToDiseaseDirectory.convert(provisional_diagnosis));

        if(source.getLaboratoryTransactionDetailCommands()!=null && source.getLaboratoryTransactionDetailCommands().size()>0)
            source.getLaboratoryTransactionDetailCommands().forEach(laboratoryTransactionDetailCommand ->
                    transaction.getLaboratoryTransactionDetails().add(
                            labTxnDetailCommandToLabTxnDetail.convert(laboratoryTransactionDetailCommand)
                    ));

        if(source.getServiceTxnId() != null){
            ServiceTransaction txn = new ServiceTransaction();
            txn.setId(source.getServiceTxnId());
            transaction.setServiceTransaction(txn);
        }
        transaction.setAnonymous(source.getAnonymous());
        transaction.setAgeInResult(source.getAgeInResult());
        return transaction;
    }
}
