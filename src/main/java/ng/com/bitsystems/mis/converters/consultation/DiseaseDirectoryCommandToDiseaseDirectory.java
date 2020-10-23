package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.DiseaseDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import org.springframework.core.convert.converter.Converter;

public class DiseaseDirectoryCommandToDiseaseDirectory implements Converter<DiseaseDirectoryCommand, DiseaseDirectory> {

    @Override
    public DiseaseDirectory convert(DiseaseDirectoryCommand source) {
        return null;
    }
}
