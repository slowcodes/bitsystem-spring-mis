package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.ExpenseManagerCommand;
import ng.com.bitsystems.mis.models.accounts.ExpenseManager;
import org.springframework.core.convert.converter.Converter;

public class ExpeneseManagerCommandToExpenseManager implements Converter<ExpenseManagerCommand, ExpenseManager> {
    @Override
    public ExpenseManager convert(ExpenseManagerCommand source) {
        return null;
    }
}
