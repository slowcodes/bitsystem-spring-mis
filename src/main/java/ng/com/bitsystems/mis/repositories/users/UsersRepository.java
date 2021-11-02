package ng.com.bitsystems.mis.repositories.users;

import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<AppUsers, Long> {
}
