package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.VerifiedResultCommand;
import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import org.springframework.core.convert.converter.Converter;

public class VerifiedResultCommandToVerifiedResult implements Converter<VerifiedResultCommand, VerifiedResults> {
    @Override
    public VerifiedResults convert(VerifiedResultCommand source) {
        return null;
    }
}
