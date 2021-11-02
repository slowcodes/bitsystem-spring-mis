package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.InternalOrgansDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.InternalOrgansDirectory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InternalOrganDirectoryToInternalOrganDirectoryCommand
implements Converter<InternalOrgansDirectory, InternalOrgansDirectoryCommand> {
    @Override
    public InternalOrgansDirectoryCommand convert(InternalOrgansDirectory source) {
        if(source==null){
            return null;
        }
        final InternalOrgansDirectoryCommand internalOrgansDirectoryCommand=new InternalOrgansDirectoryCommand();
        internalOrgansDirectoryCommand.setId(source.getId());
        internalOrgansDirectoryCommand.setSystem(source.getSystem());

        return internalOrgansDirectoryCommand;
    }
}
