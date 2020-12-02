package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.FamilyHistoryCommand;
import ng.com.bitsystems.mis.converters.consultation.DiseaseDirectoryCommandToDiseaseDirectory;
import ng.com.bitsystems.mis.models.patients.FamilyFolder;
import ng.com.bitsystems.mis.models.patients.FamilyHistory;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class FamilyHistoryCommandToFamilyHistory implements Converter<FamilyHistoryCommand, FamilyHistory> {
    private DiseaseDirectoryCommandToDiseaseDirectory diseaseDirectoryCommandToDiseaseDirectory;

    public FamilyHistoryCommandToFamilyHistory(DiseaseDirectoryCommandToDiseaseDirectory diseaseDirectoryCommandToDiseaseDirectory) {
        this.diseaseDirectoryCommandToDiseaseDirectory = diseaseDirectoryCommandToDiseaseDirectory;
    }

    @Nullable
    @Override
    public FamilyHistory convert(FamilyHistoryCommand source) {

        if(source==null)
            return null;

        final FamilyHistory familyHistory=new FamilyHistory();

        familyHistory.setId(source.getId());
        familyHistory.setDateRecorded(source.getDateRecorded());
        familyHistory.setDiseaseDirectory(diseaseDirectoryCommandToDiseaseDirectory.convert(source.getDiseaseDirectory()));
        familyHistory.setNote(source.getNote());

        if(source.getFamilyFolderId()!=null){
            FamilyFolder familyFolder = new FamilyFolder();
            familyFolder.setId(source.getFamilyFolderId());
            familyHistory.setFamilyFolder(familyFolder);
            FamilyFolder folder = familyFolder.addFamilyHistory(familyHistory);
        }

        if(source.getUserId()!=null){
            Users physicians = new Users();
            physicians.setId(source.getUserId());
            familyHistory.setUsers(physicians);
            Users doctor = physicians.addFamilyHistory(familyHistory);
        }

        return familyHistory;
    }
}
