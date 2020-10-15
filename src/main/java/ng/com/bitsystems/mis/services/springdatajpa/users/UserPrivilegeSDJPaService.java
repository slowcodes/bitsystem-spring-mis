package ng.com.bitsystems.mis.services.springdatajpa.users;

import ng.com.bitsystems.mis.models.users.UsersPrivilege;
import ng.com.bitsystems.mis.repositories.users.UsersPrivilegeRepository;
import ng.com.bitsystems.mis.services.users.UserPrivilegeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserPrivilegeSDJPaService implements UserPrivilegeService {
    private UsersPrivilegeRepository usersPrivilegeRepository;

    public UserPrivilegeSDJPaService(UsersPrivilegeRepository usersPrivilegeRepository) {
        this.usersPrivilegeRepository = usersPrivilegeRepository;
    }

    @Override
    public Set<UsersPrivilege> findAll() {
        Set<UsersPrivilege> usersPrivileges=new HashSet<>();
        usersPrivilegeRepository.findAll().forEach(usersPrivileges::add);
        return usersPrivileges;
    }

    @Override
    public UsersPrivilege findByID(Long aLong) {
        return usersPrivilegeRepository.findById(aLong).get();
    }

    @Override
    public UsersPrivilege add(UsersPrivilege object) {
        return usersPrivilegeRepository.save(object);
    }

    @Override
    public void delete(UsersPrivilege object) {
        usersPrivilegeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        usersPrivilegeRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(UsersPrivilege object) {

    }
}
