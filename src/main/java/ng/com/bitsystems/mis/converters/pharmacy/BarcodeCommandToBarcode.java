package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.BarcodeCommand;
import ng.com.bitsystems.mis.models.pharmacy.Barcodes;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import org.springframework.core.convert.converter.Converter;

public class BarcodeCommandToBarcode implements Converter<BarcodeCommand, Barcodes> {
    @Override
    public Barcodes convert(BarcodeCommand source) {

        if(source==null){
            return null;
        }

        final Barcodes barcodes=new Barcodes();
        barcodes.setBarcode(source.getBarcode());

        if(source.getPharmacyProductCommandId()!=null){
            PharmacyProducts pharmacyProducts=new PharmacyProducts();
            pharmacyProducts.setId(source.getPharmacyProductCommandId());
            barcodes.setPharmacyProducts(pharmacyProducts);
            PharmacyProducts pharmacyProduct = pharmacyProducts.addPharmacy(barcodes);
        }

        return barcodes;
    }
}
