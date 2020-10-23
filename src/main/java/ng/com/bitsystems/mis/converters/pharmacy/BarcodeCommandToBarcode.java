package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.BarcodeCommand;
import ng.com.bitsystems.mis.models.pharmacy.Barcodes;
import org.springframework.core.convert.converter.Converter;

public class BarcodeCommandToBarcode implements Converter<BarcodeCommand, Barcodes> {
    @Override
    public Barcodes convert(BarcodeCommand source) {
        return null;
    }
}
