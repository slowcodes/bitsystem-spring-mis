package ng.com.bitsystems.mis.converters.transaction.vaccination;

import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;
import org.springframework.core.convert.converter.Converter;

public class VaccTxnDetailToVaccTxnDetailCommand implements
        Converter<VaccinationTransactionsDetails, VaccinationTransactionDetailCommand> {
    @Override
    public VaccinationTransactionDetailCommand convert(VaccinationTransactionsDetails source) {
        return null;
    }
}
