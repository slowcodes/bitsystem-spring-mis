package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.SymptomsDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.SymptomsDirectory;
import org.springframework.core.convert.converter.Converter;

public class SymptomsDirectoryCommandToSymptomsDirectory implements Converter<SymptomsDirectoryCommand, SymptomsDirectory> {
    @Override
    public SymptomsDirectory convert(SymptomsDirectoryCommand source) {
        if(source==null){
            return null;
        }

        final SymptomsDirectory symptomsDirectory = new  SymptomsDirectory();
        symptomsDirectory.setSymptoms(source.getSymptoms());
        symptomsDirectory.setId(source.getId());

        return symptomsDirectory;
    }
}
