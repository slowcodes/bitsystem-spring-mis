package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.ClearedQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.ClearedQueue;
import org.springframework.core.convert.converter.Converter;

public class ClearedQueueCommandToClearedQueue implements Converter<ClearedQueueCommand, ClearedQueue> {
    @Override
    public ClearedQueue convert(ClearedQueueCommand source) {
        return null;
    }
}
