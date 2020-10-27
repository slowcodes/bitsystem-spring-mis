package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.ExpenseManagerCommand;
import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import ng.com.bitsystems.mis.models.accounts.ExpenseManager;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class ExpenseManagerCommandToExpenseManager implements Converter<ExpenseManagerCommand, ExpenseManager> {
    @Override
    public ExpenseManager convert(ExpenseManagerCommand source) {
        if(source ==null){
            return null;
        }

        ExpenseManager expenseManager = new ExpenseManager();
        expenseManager.setId(source.getId());
        expenseManager.setAmount(source.getAmount());

        if(source.getExpenseBookId() !=null){
            AccountBooks accountBooks = new AccountBooks();
            accountBooks.setId(source.getExpenseBookId());
            expenseManager.setAccountBooks(accountBooks);
            AccountBooks eBooks = accountBooks.addExpense(expenseManager);
        }

        expenseManager.setAmount(source.getAmount());
        expenseManager.setExpenseDate(source.getExpenseDate());
        expenseManager.setPurpose(source.getPurpose());

        if(source.getUsersByIssueToId()!=null){
            Users receiver = new Users();
            receiver.setId(source.getUsersByIssueToId());
            expenseManager.setUsersByIssueTo(receiver);
            receiver.addReciever(expenseManager);
        }

        if(source.getUsersByTellerId() !=null){
            Users issuer = new Users();
            issuer.setId(source.getUsersByTellerId());
            expenseManager.setUsersByTeller(issuer);
            issuer.addIssuer(expenseManager);
        }

        return expenseManager;
    }
}
