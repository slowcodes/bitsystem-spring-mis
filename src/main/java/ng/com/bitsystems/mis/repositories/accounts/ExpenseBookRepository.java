package ng.com.bitsystems.mis.repositories.accounts;

import ng.com.bitsystems.mis.models.accounts.ExpenseBooks;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseBookRepository extends CrudRepository<ExpenseBooks, Long> {
}
