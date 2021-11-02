package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SalesPriceCodeCommandToSalesPriceCode implements Converter<SalesPriceCodeCommand, SalesPriceCode> {
    @Override
    public SalesPriceCode convert(SalesPriceCodeCommand source) {
        if(source==null){
            return null;
        }
        SalesPriceCode salesPriceCode=new SalesPriceCode();
        salesPriceCode.setId(source.getId());
        salesPriceCode.setBuyingPrice(source.getBuyingPrice());
        salesPriceCode.setSellingPrice(source.getSellingPrice());
        salesPriceCode.setDiscountQty(source.getDiscountQuantity());
        salesPriceCode.setDiscountPrice(source.getDiscountPrice());
        salesPriceCode.setTax(source.getTax());
        return salesPriceCode;
    }
}
