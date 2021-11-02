package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.ExpenseBooksCommand;
import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ExpenseBookToExpenseBookCommand implements Converter<AccountBooks, ExpenseBooksCommand> {

    private ExpenseManagerToExpenseManagerCommand expenseManagerToExpenseManagerCommand;

    public ExpenseBookToExpenseBookCommand(ExpenseManagerToExpenseManagerCommand expenseManagerToExpenseManagerCommand) {
        this.expenseManagerToExpenseManagerCommand = expenseManagerToExpenseManagerCommand;
    }

    @Override
    public ExpenseBooksCommand convert(AccountBooks source) {
        if(source==null){
            return null;
        }
        ExpenseBooksCommand expenseBooksCommand = new ExpenseBooksCommand();
        expenseBooksCommand.setId(source.getId());

        if(source.getCreatedBy() != null)
            expenseBooksCommand.setCreatedById(source.getCreatedBy().getId());

        expenseBooksCommand.setDescription(source.getDescription());
        if(source.getExpenseManager() !=null && source.getExpenseManager().size()>0){
            source.getExpenseManager().forEach(expenseManager -> expenseBooksCommand.getExpenseManagerCommands().add(expenseManagerToExpenseManagerCommand.convert(expenseManager)));
        }

        expenseBooksCommand.setParentBookId(source.getParentBook());
        return expenseBooksCommand;
    }
}
