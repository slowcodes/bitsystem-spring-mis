package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.FamilyFolderCommand;
import ng.com.bitsystems.mis.models.patients.FamilyFolder;
import org.springframework.core.convert.converter.Converter;

public class FamilyFolderToFamilyFolderCommand implements
        Converter<FamilyFolder, FamilyFolderCommand> {
    private PatientToPatientCommand patientToPatientCommand;
    private FamilyHistoryToFamilyHistoryCommand familyHistoryToFamilyHistoryCommand;

    public FamilyFolderToFamilyFolderCommand(PatientToPatientCommand patientToPatientCommand, FamilyHistoryToFamilyHistoryCommand familyHistoryToFamilyHistoryCommand) {
        this.patientToPatientCommand = patientToPatientCommand;
        this.familyHistoryToFamilyHistoryCommand = familyHistoryToFamilyHistoryCommand;
    }

    @Override
    public FamilyFolderCommand convert(FamilyFolder source) {
        if(source==null)
            return null;

        final FamilyFolderCommand familyFolderCommand=new FamilyFolderCommand();
        familyFolderCommand.setId(source.getId());

        if(source.getPatients().size()>0 && source.getPatients()!=null)
            source.getPatients().forEach(patients ->
                    familyFolderCommand.getPatientCommands().add(
                            patientToPatientCommand.convert(patients)
                    ));

        if (source.getFamilyHistory().size()>0 && source.getFamilyHistory()!=null)
            source.getFamilyHistory().forEach(patientsFamilyHistory ->
                    familyFolderCommand.getPatientsFamilyHistory().add(
                            familyHistoryToFamilyHistoryCommand.convert(patientsFamilyHistory)
                    ));

        familyFolderCommand.setDateRegistered(source.getDateRegistered());
        familyFolderCommand.setEmail(source.getEmail());
        familyFolderCommand.setFamilyName(source.getFamilyName());
        familyFolderCommand.setPhone(source.getPhone());

        return familyFolderCommand;
    }
}
