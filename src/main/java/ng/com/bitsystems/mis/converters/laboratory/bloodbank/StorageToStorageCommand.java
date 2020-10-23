package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.StorageCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import org.springframework.core.convert.converter.Converter;

public class StorageToStorageCommand implements Converter<Storage, StorageCommand> {
    @Override
    public StorageCommand convert(Storage source) {
        return null;
    }
}
