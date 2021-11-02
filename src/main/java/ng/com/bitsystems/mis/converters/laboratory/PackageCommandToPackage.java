package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.PackageCommand;
import ng.com.bitsystems.mis.models.laboratories.LabPackages;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PackageCommandToPackage implements Converter<PackageCommand, LabPackages> {
    @Override
    public LabPackages convert(PackageCommand source) {
        if(source ==null){
            return null;
        }
        final LabPackages labPackages =new LabPackages();

        labPackages.setId(source.getId());
        labPackages.setDiscount(source.getDiscount());
        labPackages.setPackageDesc(source.getPackageDesc());
        labPackages.setPackageName(source.getPackageName());


        return labPackages;
    }
}
