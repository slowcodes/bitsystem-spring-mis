package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionDetails;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class AdditionalTxnDetailCommandToAdditionTnxDetail implements
        Converter<AdditionalTransactionDetailCommand, AdditionalTransactionDetails> {


    @Nullable
    @Override
    public AdditionalTransactionDetails convert(AdditionalTransactionDetailCommand source) {
        if(source==null)
            return null;
        AdditionalTransactionDetails details = new AdditionalTransactionDetails();
        details.setId(source.getId());

        if(source.getPharmSalesTxnDetailId()!=null){
            PharmacyTransactionDetails pharmacyTransactionDetails=new PharmacyTransactionDetails();
            pharmacyTransactionDetails.setId(source.getPharmSalesTxnDetailId());
            details.setPharmacyTransactionDetails(pharmacyTransactionDetails);
            PharmacyTransactionDetails pharmTxn = pharmacyTransactionDetails.addAdditionalDetail(details);
        }

        if(source.getParameterId()!=null){
            AdditionalTransactionParameters additionalTransactionParameters=new AdditionalTransactionParameters();
            additionalTransactionParameters.setId(source.getParameterId());
            details.setTransactionParameters(additionalTransactionParameters);
            AdditionalTransactionParameters parameter = additionalTransactionParameters.addSalesTxnDetail(details);
        }

        details.setShowInReciept(source.getShowInReciept());
        details.setValue(source.getValue());

        return details;
    }
}
