package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalTransactionParameterCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import org.springframework.core.convert.converter.Converter;

public class AdditionalTxnParameterCommandToAdditionalTxnParameter implements
        Converter<AdditionalTransactionParameterCommand, AdditionalTransactionParameters> {
    private AdditionalSaleTxnDetailCommandToAdditionTnxDetail additionalSaleTxnDetailCommandToAdditionTnxDetail;
    private AdditionalSupplyTxnDetailCommandToAdditionTnxDetail additionalSupplyTxnDetailCommandToAdditionTnxDetail;

    public AdditionalTxnParameterCommandToAdditionalTxnParameter(AdditionalSaleTxnDetailCommandToAdditionTnxDetail additionalSaleTxnDetailCommandToAdditionTnxDetail,
                                                                 AdditionalSupplyTxnDetailCommandToAdditionTnxDetail additionalSupplyTxnDetailCommandToAdditionTnxDetail) {
        this.additionalSaleTxnDetailCommandToAdditionTnxDetail = additionalSaleTxnDetailCommandToAdditionTnxDetail;
        this.additionalSupplyTxnDetailCommandToAdditionTnxDetail = additionalSupplyTxnDetailCommandToAdditionTnxDetail;
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

        if (source.getAdditionalSalesTransactionDetailCommand().size()>0 && source.getAdditionalSalesTransactionDetailCommand()!=null)
            source.getAdditionalSalesTransactionDetailCommand().forEach(additionalTransactionDetails ->
                    detail.getAdditionalSaleTransactionDetails().add(
                            additionalSaleTxnDetailCommandToAdditionTnxDetail.convert(
                                    additionalTransactionDetails
                            )
                    ));

        if (source.getAdditionalSupplyTransactionDetailCommand().size()>0 && source.getAdditionalSupplyTransactionDetailCommand()!=null)
            source.getAdditionalSupplyTransactionDetailCommand().forEach(additionalTransactionDetails ->
                    detail.getAdditionalSupplyTransactionDetails().add(
                            additionalSupplyTxnDetailCommandToAdditionTnxDetail.convert(
                                    additionalTransactionDetails
                            )
                    ));
        return detail;
    }
}
