package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.ExpenseBooksCommand;
import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ExpenseBookCommandToExpenseBook implements Converter<ExpenseBooksCommand, AccountBooks> {

    private ExpenseManagerCommandToExpenseManager expenseManagerCommandToExpenseManager;

    public ExpenseBookCommandToExpenseBook(ExpenseManagerCommandToExpenseManager expenseManagerToExpenseManagerCommand) {
        this.expenseManagerCommandToExpenseManager = expenseManagerToExpenseManagerCommand;
    }

    @Override
    public AccountBooks convert(ExpenseBooksCommand source) {
        if(source==null){
            return null;
        }
        AccountBooks accountBooks = new AccountBooks();
        accountBooks.setId(source.getId());
        if(source.getCreatedById()!=null){
            AppUsers appUsers = new AppUsers();
            appUsers.setId(source.getCreatedById());
            accountBooks.setCreatedBy(appUsers);
            AppUsers usr = appUsers.addExpenseBookCreator(accountBooks);
        }
        accountBooks.setDescription(source.getDescription());

        if(source.getExpenseManagerCommands()!=null && source.getExpenseManagerCommands().size()>0) {
            source.getExpenseManagerCommands().forEach(expMgrCmd -> {
                accountBooks.getExpenseManager().add(expenseManagerCommandToExpenseManager.convert(expMgrCmd));
            });
        }
        return accountBooks;
    }
}
