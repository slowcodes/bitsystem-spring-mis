package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalTransactionParameterCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AdditionalTxnParameterCommandToAdditionalTxnParameter implements
        Converter<AdditionalTransactionParameterCommand, AdditionalTransactionParameters> {
    private AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail;

    public AdditionalTxnParameterCommandToAdditionalTxnParameter(AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail) {
        this.additionalTxnDetailCommandToAdditionTnxDetail = additionalTxnDetailCommandToAdditionTnxDetail;
    }
    @Override
    public AdditionalTransactionParameters convert(AdditionalTransactionParameterCommand source) {
        if(source==null)
            return null;

        AdditionalTransactionParameters detail=new AdditionalTransactionParameters();

        detail.setId(source.getId());
        detail.setDataType(source.getDataType());
        detail.setDescription(source.getDescription());
        detail.setParameter(detail.getParameter());

        if (source.getAdditionalTransactionDetailCommand().size()>0 && source.getAdditionalTransactionDetailCommand()!=null)
            source.getAdditionalTransactionDetailCommand().forEach(additionalTransactionDetails ->
                    detail.getAdditionalTransactionDetails().add(
                            additionalTxnDetailCommandToAdditionTnxDetail.convert(
                                    additionalTransactionDetails
                            )
                    ));

//        if (source.getAdditionalSupplyTransactionDetailCommand().size()>0 && source.getAdditionalSupplyTransactionDetailCommand()!=null)
//            source.getAdditionalSupplyTransactionDetailCommand().forEach(additionalTransactionDetails ->
//                    detail.getAdditionalSupplyTransactionDetails().add(
//                            additionalSupplyTxnDetailCommandToAdditionTnxDetail.convert(
//                                    additionalTransactionDetails
//                            )
//                    ));
        return detail;
    }
}
