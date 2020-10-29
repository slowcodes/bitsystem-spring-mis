package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.DiseaseDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import org.springframework.core.convert.converter.Converter;

public class DiseaseDirectoryToDiseaseDirectoryCommand implements Converter<DiseaseDirectory, DiseaseDirectoryCommand> {
    @Override
    public DiseaseDirectoryCommand convert(DiseaseDirectory source) {
        if(source==null){
            return null;
        }
        DiseaseDirectoryCommand diseaseDirectoryCommand = new DiseaseDirectoryCommand();
        diseaseDirectoryCommand.setId(source.getId());
        if(source.getCreatedBy()!=null)
            diseaseDirectoryCommand.setCreatedBy(source.getCreatedBy().getId());
        diseaseDirectoryCommand.setDescription(source.getDescription());
        diseaseDirectoryCommand.setDisease(source.getDisease());

        return diseaseDirectoryCommand;
    }
}
