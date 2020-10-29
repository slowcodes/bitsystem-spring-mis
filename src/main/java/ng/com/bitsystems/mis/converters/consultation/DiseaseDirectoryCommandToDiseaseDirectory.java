package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.DiseaseDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class DiseaseDirectoryCommandToDiseaseDirectory implements Converter<DiseaseDirectoryCommand, DiseaseDirectory> {

    @Override
    public DiseaseDirectory convert(DiseaseDirectoryCommand source) {
        if(source==null){
            return null;
        }
        DiseaseDirectory diseaseDirectory = new DiseaseDirectory();
        diseaseDirectory.setId(source.getId());
        if(source.getCreatedBy()!=null){
            Users users= new Users();
            users.setId(source.getCreatedBy());
            diseaseDirectory.setCreatedBy(users);
        }
        diseaseDirectory.setDescription(source.getDescription());
        diseaseDirectory.setDisease(source.getDisease());
        return diseaseDirectory;
    }
}
