package ng.com.bitsystems.mis.repositories.accounts;

import ng.com.bitsystems.mis.models.accounts.ExpenseManager;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseManagerRepository extends CrudRepository<ExpenseManager, Long> {
}
