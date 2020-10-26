package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import org.springframework.core.convert.converter.Converter;

public class SalesPriceCodeToSalesPriceCodeCommand implements Converter<SalesPriceCode, SalesPriceCodeCommand> {
    @Override
    public SalesPriceCodeCommand convert(SalesPriceCode source) {
        return null;
    }
}
