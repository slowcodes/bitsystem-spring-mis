package ng.com.bitsystems.mis.services.springdatajpa.users;

import ng.com.bitsystems.mis.models.users.AppUsers;
import ng.com.bitsystems.mis.repositories.users.UsersRepository;
import ng.com.bitsystems.mis.services.users.UserService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserSDJPaService implements UserService {
    private UsersRepository usersRepository;

    public UserSDJPaService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Set<AppUsers> findAll() {
        Set<AppUsers> users= new HashSet<>();
        usersRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public AppUsers findByID(Long aLong) {
        return usersRepository.findById(aLong).get();
    }

    @Override
    public AppUsers add(AppUsers object) {
        return usersRepository.save(object);
    }

    @Override
    public void delete(AppUsers object) {
        usersRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        usersRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(AppUsers object) {

    }
}
