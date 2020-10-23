package ng.com.bitsystems.mis.converters.transaction.vaccination;

import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import org.springframework.core.convert.converter.Converter;

public class VaccTxnCommandToVaccTxn implements
        Converter<VaccinationTransactionCommand, VaccinationTransaction> {
    @Override
    public VaccinationTransaction convert(VaccinationTransactionCommand source) {
        return null;
    }
}
