package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySupplyTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactions;
import org.springframework.core.convert.converter.Converter;

public class PharmSupplyTxnCommandToPharmSupplyTxn implements
        Converter<PharmacySupplyTransactionCommand, PharmacySupplyTransactions> {
    @Override
    public PharmacySupplyTransactions convert(PharmacySupplyTransactionCommand source) {
        return null;
    }
}
