package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.CollectedSamplesCommand;
import ng.com.bitsystems.mis.models.laboratories.CollectedSamples;
import org.springframework.core.convert.converter.Converter;

public class CollectedSampleCommandToCollectedSample implements Converter<CollectedSamplesCommand, CollectedSamples> {
    @Override
    public CollectedSamples convert(CollectedSamplesCommand source) {
        return null;
    }
}
