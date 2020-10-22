package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredPharmacyTransactionCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredPharmacyTransactions;
import org.springframework.core.convert.converter.Converter;


public class InsuredPharmTxnToInsuredPharmTxnCmd implements Converter<InsuredPharmacyTransactions, InsuredPharmacyTransactionCommand> {
    @Override
    public InsuredPharmacyTransactionCommand convert(InsuredPharmacyTransactions source) {
        return null;
    }
}
