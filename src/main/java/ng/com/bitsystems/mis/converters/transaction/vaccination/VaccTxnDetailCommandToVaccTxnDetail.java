package ng.com.bitsystems.mis.converters.transaction.vaccination;

import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;
import ng.com.bitsystems.mis.models.vaccination.Vaccines;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class VaccTxnDetailCommandToVaccTxnDetail implements
        Converter<VaccinationTransactionDetailCommand, VaccinationTransactionsDetails> {
    private ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode;

    public VaccTxnDetailCommandToVaccTxnDetail(ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode) {
        this.servicePriceCodeCommandToServicePriceCode = servicePriceCodeCommandToServicePriceCode;
    }

    @Nullable
    @Override
    public VaccinationTransactionsDetails convert(VaccinationTransactionDetailCommand source) {
        if(source==null)
            return null;

        VaccinationTransactionsDetails transactions = new VaccinationTransactionsDetails();
        transactions.setId(source.getId());

        if(source.getVaccineId()!=null){
            Vaccines vaccines = new Vaccines();
            vaccines.setId(source.getVaccineId());
            transactions.setVaccinations(vaccines);
            Vaccines vaccine  = vaccines.addTransaction(transactions);
        }

        if(source.getVaccinationTransactionId()!=null){
            VaccinationTransaction vaccinationTransaction=new VaccinationTransaction();
            vaccinationTransaction.setId(source.getVaccinationTransactionId());
            transactions.setVaccinationTransaction(vaccinationTransaction);
            VaccinationTransaction vaccinationTransactions = vaccinationTransaction.addTxnDetail(transactions);
        }

        transactions.setComment(source.getComment());
        transactions.setFrequency(source.getReversal());
        transactions.setReversal(source.getReversal());
        transactions.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
        transactions.setTimeOfTransaction(source.getTimeOfTransaction());
        transactions.setUseDiscountPrice(source.getUseDiscountPrice());
        transactions.setUserDiscount(source.getUserDiscount());
        return transactions;
    }
}
