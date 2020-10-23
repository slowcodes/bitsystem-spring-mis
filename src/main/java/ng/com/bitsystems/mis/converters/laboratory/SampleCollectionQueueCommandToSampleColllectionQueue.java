package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.SampleCollectionQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.SampleCollectionQueue;
import org.springframework.core.convert.converter.Converter;

public class SampleCollectionQueueCommandToSampleColllectionQueue
implements Converter<SampleCollectionQueueCommand, SampleCollectionQueue> {
    @Override
    public SampleCollectionQueue convert(SampleCollectionQueueCommand source) {
        return null;
    }
}
