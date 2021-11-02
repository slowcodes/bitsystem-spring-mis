package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.BarcodeCommand;
import ng.com.bitsystems.mis.models.pharmacy.Barcodes;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BarcodeToBarcodeCommand implements Converter<Barcodes, BarcodeCommand> {
    @Override
    public BarcodeCommand convert(Barcodes source) {

        if(source==null)
            return null;

        BarcodeCommand barcodeCommand=new BarcodeCommand();

        barcodeCommand.setId(source.getId());
        barcodeCommand.setBarcode(source.getBarcode());

        if(source.getPharmacyProducts() != null){
            barcodeCommand.setPharmacyProductCommandId(source.getPharmacyProducts().getId());
        }

        return barcodeCommand;
    }
}
