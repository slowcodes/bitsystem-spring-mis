package ng.com.bitsystems.mis.converters.transaction.vaccination;

import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class VaccTxnDetailToVaccTxnDetailCommand implements
        Converter<VaccinationTransactionsDetails, VaccinationTransactionDetailCommand> {
    private ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand;

    public VaccTxnDetailToVaccTxnDetailCommand(ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand) {
        this.servicePriceCodeToServicePriceCodeCommand = servicePriceCodeToServicePriceCodeCommand;
    }

    @Nullable
    @Override
    public VaccinationTransactionDetailCommand convert(VaccinationTransactionsDetails source) {
        if(source==null)
            return null;

        VaccinationTransactionDetailCommand command = new VaccinationTransactionDetailCommand();
        command.setId(source.getId());

        if(source.getVaccine()!=null){
            command.setVaccineId(source.getVaccine().getId());
        }

        if(source.getVaccinationTransaction()!=null){
            command.setVaccinationTransactionId(source.getVaccinationTransaction().getId());
        }

//        command.setComment(source.getComment());
//        command.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getServicePriceCode()));
//        command.setTimeOfTransaction(source.getTimeOfTransaction());
//        command.setUseDiscountPrice(source.getUseDiscountPrice());
//        command.setUserDiscount(source.getUserDiscount());
        return command;
    }
}
