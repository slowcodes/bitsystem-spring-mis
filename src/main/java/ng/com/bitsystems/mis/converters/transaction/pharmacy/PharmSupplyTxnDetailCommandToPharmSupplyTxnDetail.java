package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySupplyTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactionsDetails;
import org.springframework.core.convert.converter.Converter;

public class PharmSupplyTxnDetailCommandToPharmSupplyTxnDetail implements
        Converter<PharmacySupplyTransactionDetailCommand, PharmacySupplyTransactionsDetails> {
    @Override
    public PharmacySupplyTransactionsDetails convert(PharmacySupplyTransactionDetailCommand source) {
        return null;
    }
}
