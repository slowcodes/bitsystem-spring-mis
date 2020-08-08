package ng.com.bitsystems.mis.repositories.users;

import ng.com.bitsystems.mis.models.users.States;
import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<States, Long> {
}
