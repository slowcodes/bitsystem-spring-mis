package ng.com.bitsystems.mis.services.springdatajpa.accounts;

import ng.com.bitsystems.mis.models.accounts.ExpenseManager;
import ng.com.bitsystems.mis.repositories.accounts.ExpenseManagerRepository;
import ng.com.bitsystems.mis.services.accounts.ExpenseManagerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ExpenseManagerSDPaService implements ExpenseManagerService {
    private ExpenseManagerRepository expenseManagerRepository;

    public ExpenseManagerSDPaService(ExpenseManagerRepository expenseManagerRepository) {
        this.expenseManagerRepository = expenseManagerRepository;
    }

    @Override
    public Set<ExpenseManager> findAll() {
        Set<ExpenseManager> expenseManagers = new HashSet<>();
        expenseManagerRepository.findAll().forEach(expenseManagers::add);
        return expenseManagers;
    }

    @Override
    public ExpenseManager findByID(Long aLong) {
        return expenseManagerRepository.findById(aLong).get();
    }

    @Override
    public ExpenseManager add(ExpenseManager object) {
        return expenseManagerRepository.save(object);
    }

    @Override
    public void delete(ExpenseManager object) {
        expenseManagerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        expenseManagerRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ExpenseManager object) {

    }
}