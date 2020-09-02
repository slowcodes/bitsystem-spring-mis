package ng.com.bitsystems.mis.services.springdatajpa.accounts;

import ng.com.bitsystems.mis.models.accounts.ExpenseBooks;
import ng.com.bitsystems.mis.repositories.accounts.ExpenseBookRepository;
import ng.com.bitsystems.mis.services.accounts.ExpenseBookService;

import java.util.HashSet;
import java.util.Set;

public class ExpenseBooksSDJPaService implements ExpenseBookService {
    private ExpenseBookRepository expenseBookRepository;

    public ExpenseBooksSDJPaService(ExpenseBookRepository expenseBookRepository) {
        this.expenseBookRepository = expenseBookRepository;
    }

    @Override
    public Set<ExpenseBooks> findAll() {
        Set<ExpenseBooks> expenseBooks = new HashSet<>();
        expenseBookRepository.findAll().forEach(expenseBooks::add);
        return expenseBooks;
    }

    @Override
    public ExpenseBooks findByID(Long aLong) {
        return expenseBookRepository.findById(aLong).get();
    }

    @Override
    public ExpenseBooks add(ExpenseBooks object) {
        return expenseBookRepository.save(object);
    }

    @Override
    public void delete(ExpenseBooks object) {
        expenseBookRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        expenseBookRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ExpenseBooks object) {

    }
}
