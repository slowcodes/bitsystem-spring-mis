package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.ExpenseManagerCommand;
import ng.com.bitsystems.mis.models.accounts.ExpenseManager;
import org.springframework.core.convert.converter.Converter;

public class ExpenseManagerToExpenseManagerCommand implements Converter<ExpenseManager, ExpenseManagerCommand> {
    @Override
    public ExpenseManagerCommand convert(ExpenseManager source) {
        return null;
    }
}
