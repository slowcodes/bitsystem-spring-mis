package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.SocioCulturalCommand;
import ng.com.bitsystems.mis.models.patients.SocioCulturalDirectory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class SocioCultureCommandToSocioCulture
implements Converter<SocioCulturalCommand, SocioCulturalDirectory> {


    @Nullable
    @Override
    public SocioCulturalDirectory convert(SocioCulturalCommand source) {

        if(source==null){
            return null;
        }
        final SocioCulturalDirectory socioCulturalDirectory=new SocioCulturalDirectory();
        socioCulturalDirectory.setActivity(source.getActivity());
        socioCulturalDirectory.setId(source.getId());

        return socioCulturalDirectory;
    }
}
