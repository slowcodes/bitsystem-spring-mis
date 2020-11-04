package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySupplyTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactions;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PharmSupplyTxnToPharmSupplyTxnCommand implements Converter<PharmacySupplyTransactions,
        PharmacySupplyTransactionCommand> {
    private PharmSupplyTxnDetailToPharmSupplyTxnDetailCommand pharmSupplyTxnDetailToPharmSupplyTxnDetailCommand;

    public PharmSupplyTxnToPharmSupplyTxnCommand(PharmSupplyTxnDetailToPharmSupplyTxnDetailCommand pharmSupplyTxnDetailToPharmSupplyTxnDetailCommand) {
        this.pharmSupplyTxnDetailToPharmSupplyTxnDetailCommand = pharmSupplyTxnDetailToPharmSupplyTxnDetailCommand;
    }

    @Nullable
    @Override
    public PharmacySupplyTransactionCommand convert(PharmacySupplyTransactions source) {
        if(source==null)
            return null;

        final PharmacySupplyTransactionCommand command =new PharmacySupplyTransactionCommand();
        command.setId(source.getId());

        command.setComment(source.getComment());
        command.setDateTransaction(source.getDateTransaction());
        command.setDiscount(source.getDiscount());
        command.setId(source.getId());
        command.setTimeOfTransaction(source.getTimeOfTransaction());
        //command.setBuyingPrice(source.getBuyingPrice());


        if(source.getPharmacySupplyTransactionsDetails()!=null && source.getPharmacySupplyTransactionsDetails().size()>0)
            source.getPharmacySupplyTransactionsDetails().forEach(pharmacySupplyTransactionDetail ->
                    command.getPharmacySupplyTransactionDetailCommands().add(
                            pharmSupplyTxnDetailToPharmSupplyTxnDetailCommand.convert(
                                    pharmacySupplyTransactionDetail
                            )
                    ));

        if(source.getUsers()!= null){
            command.setUserId(source.getUsers().getId());
        }

        if(source.getPatients()!=null){
            command.setPatientId(source.getPatients().getId());
        }

        return command;
    }
}
