package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.SocioCulturalCommand;
import ng.com.bitsystems.mis.models.patients.SocioCulturalDirectory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class SocioCultureToSocioCultureCommand implements Converter<SocioCulturalDirectory,
        SocioCulturalCommand> {


    @Nullable
    @Override
    public SocioCulturalCommand convert(SocioCulturalDirectory source) {
        if(source==null)
            return null;

        final SocioCulturalCommand socioCulturalCommand=new SocioCulturalCommand();
        socioCulturalCommand.setId(source.getId());
        socioCulturalCommand.setActivity(source.getActivity());

        return socioCulturalCommand;
    }
}
