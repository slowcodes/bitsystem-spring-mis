package ng.com.bitsystems.mis.services.processors;

import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PaymentCalculator {

    public double rawTotal(LaboratoryTransaction transaction){

        double total = transaction.getLaboratoryTransactionDetails()
                .stream()
                .filter(laboratoryTransactionDetail ->
                        laboratoryTransactionDetail.getServiceDetailPricing().getUseDiscountPrice()==0)
                .map(laboratoryTransactionDetail -> laboratoryTransactionDetail
                        .getServiceDetailPricing().getServicePriceCode().getDiscountPrice())
                .collect(Collectors.summarizingDouble(Double::doubleValue)).getSum() +

                transaction.getLaboratoryTransactionDetails()
                        .stream()
                        .filter(laboratoryTransactionDetail ->
                                laboratoryTransactionDetail.getServiceDetailPricing().getUseDiscountPrice()==1)
                        .map(laboratoryTransactionDetail -> laboratoryTransactionDetail
                                .getServiceDetailPricing().getServicePriceCode().getDiscountPrice())
                        .collect(Collectors.summarizingDouble(Double::doubleValue)).getSum();

        double percentageDiscount = transaction.getServiceTransaction().getTransaction().getDiscount()/100 * total;
        double userDiscount = transaction.getServiceTransaction().getUserDiscount();
        return total - percentageDiscount - userDiscount;
    }

}
