package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.DiseaseDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import org.springframework.core.convert.converter.Converter;

public class DiseaseDirectoryToDiseaseDirectoryCommand implements Converter<DiseaseDirectory, DiseaseDirectoryCommand> {
    @Override
    public DiseaseDirectoryCommand convert(DiseaseDirectory source) {
        return null;
    }
}
