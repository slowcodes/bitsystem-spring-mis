package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import org.springframework.core.convert.converter.Converter;

public class PharmSalesTxnDetailCommandToPharmSalesTxnDetail implements
        Converter<PharmacySalesTransactionDetailCommand, PharmacyTransactionDetails> {
    @Override
    public PharmacyTransactionDetails convert(PharmacySalesTransactionDetailCommand source) {
        return null;
    }
}
