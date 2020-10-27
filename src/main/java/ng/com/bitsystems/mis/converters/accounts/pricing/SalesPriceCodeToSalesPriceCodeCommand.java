package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import org.springframework.core.convert.converter.Converter;

public class SalesPriceCodeToSalesPriceCodeCommand implements Converter<SalesPriceCode, SalesPriceCodeCommand> {
    @Override
    public SalesPriceCodeCommand convert(SalesPriceCode source) {
        if(source==null){
            return null;
        }
        SalesPriceCodeCommand salesPriceCodeCommand = new SalesPriceCodeCommand();
        salesPriceCodeCommand.setBuyingPrice(source.getBuyingPrice());
        salesPriceCodeCommand.setDiscountPrice(source.getDiscountPrice());
        salesPriceCodeCommand.setDiscountQuantity(source.getDiscountQty());
        salesPriceCodeCommand.setSellingPrice(source.getSellingPrice());
        salesPriceCodeCommand.setTax(source.getTax());
        return salesPriceCodeCommand;
    }
}
