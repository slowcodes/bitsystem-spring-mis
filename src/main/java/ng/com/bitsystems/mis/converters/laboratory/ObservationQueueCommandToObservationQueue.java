package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ObservationQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.ObservationQueue;
import org.springframework.core.convert.converter.Converter;

public class ObservationQueueCommandToObservationQueue implements
        Converter<ObservationQueueCommand, ObservationQueue> {
    @Override
    public ObservationQueue convert(ObservationQueueCommand source) {
        return null;
    }
}
