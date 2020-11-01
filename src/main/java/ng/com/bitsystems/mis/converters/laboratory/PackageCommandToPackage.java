package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.PackageCommand;
import ng.com.bitsystems.mis.models.laboratories.Packages;
import org.springframework.core.convert.converter.Converter;

public class PackageCommandToPackage implements Converter<PackageCommand, Packages> {
    @Override
    public Packages convert(PackageCommand source) {
        if(source ==null){
            return null;
        }
        final Packages packages=new Packages();

        packages.setId(source.getId());
        packages.setDiscount(source.getDiscount());
        packages.setPackageDesc(source.getPackageDesc());
        packages.setPackageName(source.getPackageName());


        return packages;
    }
}
