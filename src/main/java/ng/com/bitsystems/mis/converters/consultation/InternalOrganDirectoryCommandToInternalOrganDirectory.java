package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.InternalOrgansDirectoryCommand;
import ng.com.bitsystems.mis.models.consultation.InternalOrgansDirectory;
import org.springframework.core.convert.converter.Converter;

public class InternalOrganDirectoryCommandToInternalOrganDirectory implements Converter<InternalOrgansDirectoryCommand, InternalOrgansDirectory> {
    @Override
    public InternalOrgansDirectory convert(InternalOrgansDirectoryCommand source) {
        return null;
    }
}
