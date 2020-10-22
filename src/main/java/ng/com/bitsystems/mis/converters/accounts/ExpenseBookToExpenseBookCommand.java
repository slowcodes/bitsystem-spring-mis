package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.ExpenseBooksCommand;
import ng.com.bitsystems.mis.models.accounts.ExpenseBooks;
import org.springframework.core.convert.converter.Converter;

public class ExpenseBookToExpenseBookCommand implements Converter<ExpenseBooks, ExpenseBooksCommand> {
    @Override
    public ExpenseBooksCommand convert(ExpenseBooks source) {
        return null;
    }
}
