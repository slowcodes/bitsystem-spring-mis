package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.StorageCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import org.springframework.core.convert.converter.Converter;

public class StorageCommandToStorage implements Converter<StorageCommand, Storage> {
    @Override
    public Storage convert(StorageCommand source) {

        if(source==null){
            return null;
        }
        final Storage storage=new Storage();
        storage.setId(source.getId());
        storage.setDescription(source.getDescription());
//        if(source.getBloodBankTransactionDetailCommands()!=null && source.getBloodBankTransactionDetailCommands().size()>0)
//            source.getBloodBankTransactionDetailCommands().
        return storage;
    }
}
