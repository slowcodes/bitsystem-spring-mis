package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import org.springframework.core.convert.converter.Converter;

public class PharmSaleTxnToPharmSalesTxnCommand implements Converter<PharmacySalesTransaction, PharmacySalesTransactionCommand> {
    @Override
    public PharmacySalesTransactionCommand convert(PharmacySalesTransaction source) {
        return null;
    }
}
