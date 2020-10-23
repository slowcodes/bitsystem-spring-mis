package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import org.springframework.core.convert.converter.Converter;

public class PharmSalesTxnCommandToPharmSaleTxn implements Converter<PharmacySalesTransactionCommand, PharmacySalesTransaction> {
    @Override
    public PharmacySalesTransaction convert(PharmacySalesTransactionCommand source) {
        return null;
    }
}
