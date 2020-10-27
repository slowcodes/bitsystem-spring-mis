package ng.com.bitsystems.mis.services.springdatajpa.accounts;

import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import ng.com.bitsystems.mis.repositories.accounts.ExpenseBookRepository;
import ng.com.bitsystems.mis.services.accounts.ExpenseBookService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ExpenseBooksSDJPaService implements ExpenseBookService {
    private ExpenseBookRepository expenseBookRepository;

    public ExpenseBooksSDJPaService(ExpenseBookRepository expenseBookRepository) {
        this.expenseBookRepository = expenseBookRepository;
    }

    @Override
    public Set<AccountBooks> findAll() {
        Set<AccountBooks> accountBooks = new HashSet<>();
        expenseBookRepository.findAll().forEach(accountBooks::add);
        return accountBooks;
    }

    @Override
    public AccountBooks findByID(Long aLong) {
        return expenseBookRepository.findById(aLong).get();
    }

    @Override
    public AccountBooks add(AccountBooks object) {
        return expenseBookRepository.save(object);
    }

    @Override
    public void delete(AccountBooks object) {
        expenseBookRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        expenseBookRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(AccountBooks object) {

    }
}
