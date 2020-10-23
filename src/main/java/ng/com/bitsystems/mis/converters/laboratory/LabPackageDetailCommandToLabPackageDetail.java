package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryPackageDetailCommand;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryPackageDetails;
import org.springframework.core.convert.converter.Converter;

public class LabPackageDetailCommandToLabPackageDetail implements
        Converter<LaboratoryPackageDetailCommand, LaboratoryPackageDetails> {
    @Override
    public LaboratoryPackageDetails convert(LaboratoryPackageDetailCommand source) {
        return null;
    }
}
