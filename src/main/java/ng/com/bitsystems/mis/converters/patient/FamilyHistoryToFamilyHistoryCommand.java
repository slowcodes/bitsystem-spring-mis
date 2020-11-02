package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.FamilyHistoryCommand;
import ng.com.bitsystems.mis.converters.consultation.DiseaseDirectoryToDiseaseDirectoryCommand;
import ng.com.bitsystems.mis.models.patients.FamilyHistory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class FamilyHistoryToFamilyHistoryCommand implements Converter<FamilyHistory, FamilyHistoryCommand> {
    private DiseaseDirectoryToDiseaseDirectoryCommand diseaseDirectoryToDiseaseDirectoryCommand;

    public FamilyHistoryToFamilyHistoryCommand(DiseaseDirectoryToDiseaseDirectoryCommand diseaseDirectoryToDiseaseDirectoryCommand) {
        this.diseaseDirectoryToDiseaseDirectoryCommand = diseaseDirectoryToDiseaseDirectoryCommand;
    }

    @Nullable
    @Override
    public FamilyHistoryCommand convert(FamilyHistory source) {
        if(source == null)
            return null;

        final FamilyHistoryCommand familyHistoryCommand=new FamilyHistoryCommand();
        familyHistoryCommand.setId(source.getId());
        familyHistoryCommand.setDateRecorded(source.getDateRecorded());
        familyHistoryCommand.setDiseaseDirectory(diseaseDirectoryToDiseaseDirectoryCommand.convert(source.getDiseaseDirectory()));
        familyHistoryCommand.setNote(source.getNote());

        if(source.getUsers()!=null){
            familyHistoryCommand.setUserId(source.getUsers().getId());
        }

        if(source.getFamilyFolder()!=null){
            familyHistoryCommand.setFamilyFolderId(source.getFamilyFolder().getId());
        }
        return familyHistoryCommand;
    }
}
