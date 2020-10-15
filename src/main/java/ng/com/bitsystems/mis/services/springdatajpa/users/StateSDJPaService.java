package ng.com.bitsystems.mis.services.springdatajpa.users;

import ng.com.bitsystems.mis.models.users.States;
import ng.com.bitsystems.mis.repositories.users.StateRepository;
import ng.com.bitsystems.mis.services.users.StateService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class StateSDJPaService implements StateService {
    private StateRepository stateRepository;

    public StateSDJPaService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Override
    public Set<States> findAll() {
        Set<States> states = new HashSet<>();
        stateRepository.findAll().forEach(states::add);
        return states;
    }

    @Override
    public States findByID(Long aLong) {
        return stateRepository.findById(aLong).get();
    }

    @Override
    public States add(States object) {
        return stateRepository.save(object);
    }

    @Override
    public void delete(States object) {
        stateRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        stateRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(States object) {

    }
}
