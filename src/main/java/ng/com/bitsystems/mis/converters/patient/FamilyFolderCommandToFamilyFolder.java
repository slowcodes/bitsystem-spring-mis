package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.FamilyFolderCommand;
import ng.com.bitsystems.mis.models.patients.FamilyFolder;
import org.springframework.core.convert.converter.Converter;

public class FamilyFolderCommandToFamilyFolder implements Converter<FamilyFolderCommand, FamilyFolder> {
    @Override
    public FamilyFolder convert(FamilyFolderCommand source) {
        return null;
    }
}
