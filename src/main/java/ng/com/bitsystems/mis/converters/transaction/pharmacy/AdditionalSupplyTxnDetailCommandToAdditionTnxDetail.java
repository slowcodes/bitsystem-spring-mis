package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalSupplyTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalSupplyTransactionDetails;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactionsDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class AdditionalSupplyTxnDetailCommandToAdditionTnxDetail implements
        Converter<AdditionalSupplyTransactionDetailCommand, AdditionalSupplyTransactionDetails> {


    @Nullable
    @Override
    public AdditionalSupplyTransactionDetails convert(AdditionalSupplyTransactionDetailCommand source) {
        if(source==null)
            return null;
        AdditionalSupplyTransactionDetails details = new AdditionalSupplyTransactionDetails();
        details.setId(source.getId());

        if(source.getPharmSupplyTxnDetailId()!=null){
            PharmacySupplyTransactionsDetails pharmacyTransactionDetails=new PharmacySupplyTransactionsDetails();
            pharmacyTransactionDetails.setId(source.getPharmSupplyTxnDetailId());
            details.setPharmacySupplyTransactionsDetails(pharmacyTransactionDetails);
            PharmacySupplyTransactionsDetails pharmTxn = pharmacyTransactionDetails.addAdditionalDetail(details);
        }

        if(source.getParameterId()!=null){
            AdditionalTransactionParameters additionalTransactionParameters=new AdditionalTransactionParameters();
            additionalTransactionParameters.setId(source.getParameterId());
            details.setTransactionParameters(additionalTransactionParameters);
            AdditionalTransactionParameters parameter = additionalTransactionParameters.addSupplyTxnDetail(details);
        }

        details.setShowInReciept(source.getShowInReciept());
        details.setValue(source.getValue());

        return details;
    }
}
