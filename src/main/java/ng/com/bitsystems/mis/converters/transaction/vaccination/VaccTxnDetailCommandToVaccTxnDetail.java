package ng.com.bitsystems.mis.converters.transaction.vaccination;

import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;
import org.springframework.core.convert.converter.Converter;

public class VaccTxnDetailCommandToVaccTxnDetail implements
        Converter<VaccinationTransactionDetailCommand, VaccinationTransactionsDetails> {
    @Override
    public VaccinationTransactionsDetails convert(VaccinationTransactionDetailCommand source) {
        return null;
    }
}
