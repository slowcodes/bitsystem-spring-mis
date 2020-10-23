package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.StorageCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import org.springframework.core.convert.converter.Converter;

public class StorageCommandToStorage implements Converter<StorageCommand, Storage> {
    @Override
    public Storage convert(StorageCommand source) {
        return null;
    }
}
