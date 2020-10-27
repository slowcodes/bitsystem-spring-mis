package ng.com.bitsystems.mis.repositories.accounts;

import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseBookRepository extends CrudRepository<AccountBooks, Long> {
}
