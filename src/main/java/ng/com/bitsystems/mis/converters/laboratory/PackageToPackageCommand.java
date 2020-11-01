package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.PackageCommand;
import ng.com.bitsystems.mis.models.laboratories.Packages;
import org.springframework.core.convert.converter.Converter;

public class PackageToPackageCommand implements Converter<Packages, PackageCommand> {
    @Override
    public PackageCommand convert(Packages source) {
        if(source==null){
            return null;
        }

        final PackageCommand packageCommand=new PackageCommand();

        packageCommand.setDiscount(source.getDiscount());
        packageCommand.setId(source.getId());
        packageCommand.setPackageDesc(source.getPackageDesc());
        packageCommand.setPackageName(source.getPackageName());

        return packageCommand;
    }
}
