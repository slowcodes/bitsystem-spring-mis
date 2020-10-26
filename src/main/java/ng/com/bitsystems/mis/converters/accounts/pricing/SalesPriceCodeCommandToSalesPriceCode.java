package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import org.springframework.core.convert.converter.Converter;

public class SalesPriceCodeCommandToSalesPriceCode implements Converter<SalesPriceCodeCommand, SalesPriceCode> {
    @Override
    public SalesPriceCode convert(SalesPriceCodeCommand source) {
        return null;
    }
}
