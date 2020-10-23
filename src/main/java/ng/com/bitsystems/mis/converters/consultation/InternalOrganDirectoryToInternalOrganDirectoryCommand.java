package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.InternalOrgansDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.InternalOrgansDirectory;
import org.springframework.core.convert.converter.Converter;

public class InternalOrganDirectoryToInternalOrganDirectoryCommand
implements Converter<InternalOrgansDirectory, InternalOrgansDirectoryCommand> {
    @Override
    public InternalOrgansDirectoryCommand convert(InternalOrgansDirectory source) {
        return null;
    }
}
