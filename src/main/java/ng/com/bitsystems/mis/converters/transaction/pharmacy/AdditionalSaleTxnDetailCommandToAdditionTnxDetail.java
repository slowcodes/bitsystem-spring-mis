package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalSalesTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalSaleTransactionDetails;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class AdditionalSaleTxnDetailCommandToAdditionTnxDetail implements
        Converter<AdditionalSalesTransactionDetailCommand, AdditionalSaleTransactionDetails> {


    @Nullable
    @Override
    public AdditionalSaleTransactionDetails convert(AdditionalSalesTransactionDetailCommand source) {
        if(source==null)
            return null;
        AdditionalSaleTransactionDetails details = new AdditionalSaleTransactionDetails();
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
