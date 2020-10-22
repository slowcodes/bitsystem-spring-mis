package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.ExpenseBooksCommand;
import ng.com.bitsystems.mis.models.accounts.ExpenseBooks;
import org.springframework.core.convert.converter.Converter;

public class ExpenseBookCommandToExpenseBook implements Converter<ExpenseBooksCommand, ExpenseBooks> {
    @Override
    public ExpenseBooks convert(ExpenseBooksCommand source) {
        return null;
    }
}
