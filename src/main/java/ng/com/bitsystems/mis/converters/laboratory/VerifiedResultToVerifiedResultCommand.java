package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.VerifiedResultCommand;
import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import org.springframework.core.convert.converter.Converter;

public class VerifiedResultToVerifiedResultCommand
implements Converter<VerifiedResults, VerifiedResultCommand> {
    @Override
    public VerifiedResultCommand convert(VerifiedResults source) {
        return null;
    }
}
