package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.InternalOrgansDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.InternalOrgansDirectory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InternalOrganDirectoryCommandToInternalOrganDirectory implements Converter<InternalOrgansDirectoryCommand, InternalOrgansDirectory> {
    @Override
    public InternalOrgansDirectory convert(InternalOrgansDirectoryCommand source) {
        if(source==null){
            return null;
        }
        InternalOrgansDirectory internalOrgansDirectory=new InternalOrgansDirectory();
        internalOrgansDirectory.setId(source.getId());
        internalOrgansDirectory.setSystem(source.getSystem());

        return internalOrgansDirectory;
    }
}
