package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.PharmacyTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSaleTxnToPharmSalesTxnCommand;
import ng.com.bitsystems.mis.models.accounts.payments.PharmacyTransactionPayments;
import org.springframework.core.convert.converter.Converter;

public class PharmacyTransactionPaymentToPharmacyTransactionPaymentCommand
implements Converter<PharmacyTransactionPayments, PharmacyTransactionPaymentCommand> {
    PharmSaleTxnToPharmSalesTxnCommand pharmSaleTxnToPharmSalesTxnCommand;

    public PharmacyTransactionPaymentToPharmacyTransactionPaymentCommand(PharmSaleTxnToPharmSalesTxnCommand pharmSaleTxnToPharmSalesTxnCommand) {
        this.pharmSaleTxnToPharmSalesTxnCommand = pharmSaleTxnToPharmSalesTxnCommand;
    }

    @Override
    public PharmacyTransactionPaymentCommand convert(PharmacyTransactionPayments source) {
        if(source== null){
            return null;
        }
        final PharmacyTransactionPaymentCommand pharmacyTransactionPaymentCommand = new PharmacyTransactionPaymentCommand();
        pharmacyTransactionPaymentCommand.setId(source.getId());
        if(source.getUsers() != null)
            pharmacyTransactionPaymentCommand.setUserId(source.getUsers().getId());
        pharmacyTransactionPaymentCommand.setAmountPaid(source.getAmountPaid());
        pharmacyTransactionPaymentCommand.setComment(source.getComment());
        pharmacyTransactionPaymentCommand.setDateOfPayment(source.getDateOfPayment());
        pharmacyTransactionPaymentCommand.setPaymentMethod(source.getPaymentMethod());
        pharmacyTransactionPaymentCommand.setTimeOfPayment(source.getTimeOfPayment());
        pharmacyTransactionPaymentCommand.setPaymentType(source.getPaymentType());
        pharmacyTransactionPaymentCommand.setPharmacySalesTransactionCommand(pharmSaleTxnToPharmSalesTxnCommand.convert(source.getPharmacySalesTransaction()));

        return pharmacyTransactionPaymentCommand;

    }
}
