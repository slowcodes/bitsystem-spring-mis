package ng.com.bitsystems.mis.repositories.users;

import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersPrivilegeRepository extends CrudRepository<Users, Long> {
}
