package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.SampleCollectionQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.SampleCollectionQueue;
import org.springframework.core.convert.converter.Converter;

public class SampleCollectionQueueToSampleCollectionQueueCommand implements
        Converter<SampleCollectionQueue, SampleCollectionQueueCommand> {
    @Override
    public SampleCollectionQueueCommand convert(SampleCollectionQueue source) {
        return null;
    }
}
