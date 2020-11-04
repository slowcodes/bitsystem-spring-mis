package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import org.springframework.core.convert.converter.Converter;

public class PharmSaleTxnToPharmSalesTxnCommand implements Converter<PharmacySalesTransaction, PharmacySalesTransactionCommand> {
    private PharmSalesTxnDetailToPharmSalesTxnDetailCommand pharmSalesTxnDetailToPharmSalesTxnDetailCommand;

    public PharmSaleTxnToPharmSalesTxnCommand(PharmSalesTxnDetailToPharmSalesTxnDetailCommand pharmSalesTxnDetailToPharmSalesTxnDetailCommand) {
        this.pharmSalesTxnDetailToPharmSalesTxnDetailCommand = pharmSalesTxnDetailToPharmSalesTxnDetailCommand;
    }

    @Override
    public PharmacySalesTransactionCommand convert(PharmacySalesTransaction source) {
        if(source==null)
            return null;

        final PharmacySalesTransactionCommand transaction =new PharmacySalesTransactionCommand();
        transaction.setId(source.getId());

        transaction.setComment(source.getComment());
        transaction.setDateTransaction(source.getDateTransaction());
        transaction.setDiscount(source.getDiscount());
        transaction.setId(source.getId());
        transaction.setTimeOfTransaction(source.getTimeOfTransaction());


        if(source.getPharmacyTransactionDetails()!=null && source.getPharmacyTransactionDetails().size()>0)
            source.getPharmacyTransactionDetails().forEach(pharmacySalesTransactionDetail ->
                    transaction.getPharmacySalesTransactionDetailCommands().add(
                            pharmSalesTxnDetailToPharmSalesTxnDetailCommand.convert(pharmacySalesTransactionDetail)
                    ));

        if(source.getUsers()!= null){
            transaction.setUserId(source.getUsers().getId());
        }

        if(source.getPatients()!=null){
            transaction.setPatientId(source.getPatients().getId());
        }

        return transaction;
    }
}
