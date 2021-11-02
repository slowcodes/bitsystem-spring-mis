package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.ExpenseManagerCommand;
import ng.com.bitsystems.mis.models.accounts.ExpenseManager;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ExpenseManagerToExpenseManagerCommand implements Converter<ExpenseManager, ExpenseManagerCommand> {
    @Override
    public ExpenseManagerCommand convert(ExpenseManager source) {
        if (source ==null){
            return null;
        }
        ExpenseManagerCommand expenseManagerCommand = new ExpenseManagerCommand();
        expenseManagerCommand.setId(source.getId());
        expenseManagerCommand.setAmount(source.getAmount());
        if(source.getAccountBooks() !=null){
            expenseManagerCommand.setExpenseBookId(source.getAccountBooks().getId());
        }
        expenseManagerCommand.setExpenseDate(source.getExpenseDate());
        expenseManagerCommand.setPurpose(source.getPurpose());
        if(source.getAppUsersByIssueTo()!=null){
            expenseManagerCommand.setUsersByIssueToId(source.getAppUsersByIssueTo().getId());
        }

        if(source.getAppUsersByTeller() !=null){
            expenseManagerCommand.setUsersByTellerId(source.getAppUsersByTeller().getId());
        }
        return expenseManagerCommand;
    }
}
