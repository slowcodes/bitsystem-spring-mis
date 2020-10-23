package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryPackageDetailCommand;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryPackageDetails;
import org.springframework.core.convert.converter.Converter;

public class LabPackageDetailToLabPackageDetailCommand implements
        Converter<LaboratoryPackageDetails, LaboratoryPackageDetailCommand> {
    @Override
    public LaboratoryPackageDetailCommand convert(LaboratoryPackageDetails source) {
        return null;
    }
}
