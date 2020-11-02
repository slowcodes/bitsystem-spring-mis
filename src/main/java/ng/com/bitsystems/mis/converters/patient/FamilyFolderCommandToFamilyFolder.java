package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.FamilyFolderCommand;
import ng.com.bitsystems.mis.models.patients.FamilyFolder;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class FamilyFolderCommandToFamilyFolder implements Converter<FamilyFolderCommand, FamilyFolder> {
    private PatientCommandToPatient patientCommandToPatient;
    private FamilyHistoryCommandToFamilyHistory familyHistoryCommandToFamilyHistory;

    public FamilyFolderCommandToFamilyFolder(PatientCommandToPatient patientCommandToPatient,
                                             FamilyHistoryCommandToFamilyHistory familyHistoryCommandToFamilyHistory) {
        this.patientCommandToPatient = patientCommandToPatient;
        this.familyHistoryCommandToFamilyHistory = familyHistoryCommandToFamilyHistory;
    }

    @Nullable
    @Override
    public FamilyFolder convert(FamilyFolderCommand source) {

        if(source==null)
            return null;

        FamilyFolder familyFolder = new FamilyFolder();

        familyFolder.setId(source.getId());
        familyFolder.setDateRegistered(source.getDateRegistered());
        familyFolder.setFamilyName(source.getFamilyName());
        familyFolder.setEmail(source.getEmail());
        familyFolder.setPhone(source.getPhone());

        if(source.getPatientCommands()!=null && source.getPatientCommands().size()>0)
            source.getPatientCommands().forEach(patientCommand ->
                    familyFolder.getPatients().add(patientCommandToPatient.convert(patientCommand)));

        if(source.getPatientsFamilyHistory()!=null && source.getPatientsFamilyHistory().size()>0)
            source.getPatientsFamilyHistory().forEach(familyHistoryCommand ->
                    familyFolder.getFamilyHistory().add(familyHistoryCommandToFamilyHistory.convert(familyHistoryCommand)));
        return familyFolder;
    }
}
