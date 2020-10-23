package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactions;
import org.springframework.core.convert.converter.Converter;

public class PharmSupplyTxnToPharmSupplyTxnCommand implements Converter<PharmacySupplyTransactions, PharmacySupplyTransactions> {
    @Override
    public PharmacySupplyTransactions convert(PharmacySupplyTransactions source) {
        return null;
    }
}
