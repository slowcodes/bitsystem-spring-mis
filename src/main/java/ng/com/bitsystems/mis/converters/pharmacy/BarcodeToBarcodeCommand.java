package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.BarcodeCommand;
import ng.com.bitsystems.mis.models.pharmacy.Barcodes;
import org.springframework.core.convert.converter.Converter;

public class BarcodeToBarcodeCommand implements Converter<Barcodes, BarcodeCommand> {
    @Override
    public BarcodeCommand convert(Barcodes source) {
        return null;
    }
}
