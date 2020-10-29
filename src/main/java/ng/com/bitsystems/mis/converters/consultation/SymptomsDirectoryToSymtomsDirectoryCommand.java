package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.SymptomsDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.SymptomsDirectory;
import org.springframework.core.convert.converter.Converter;

public class SymptomsDirectoryToSymtomsDirectoryCommand implements Converter<SymptomsDirectory, SymptomsDirectoryCommand> {
    @Override
    public SymptomsDirectoryCommand convert(SymptomsDirectory source) {
        if(source==null){
            return null;
        }
        SymptomsDirectoryCommand symptomsDirectoryCommand=new SymptomsDirectoryCommand();
        symptomsDirectoryCommand.setId(source.getId());
        symptomsDirectoryCommand.setSymptoms(source.getSymptoms());

        return symptomsDirectoryCommand;
    }
}
