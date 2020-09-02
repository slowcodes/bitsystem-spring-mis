package ng.com.bitsystems.mis.services.springdatajpa.consulatation;

import ng.com.bitsystems.mis.models.consultation.Clerks;
import ng.com.bitsystems.mis.repositories.consultations.ClerksRepository;
import ng.com.bitsystems.mis.services.consultations.ClerkService;

import java.util.HashSet;
import java.util.Set;

public class ClerksSDJPaService implements ClerkService {
    private ClerksRepository clerksRepository;

    public ClerksSDJPaService(ClerksRepository clerksRepository) {
        this.clerksRepository = clerksRepository;
    }

    @Override
    public Set<Clerks> findAll() {
        Set<Clerks> clerks = new HashSet<>();
        clerksRepository.findAll().forEach(clerks::add);
        return clerks;
    }

    @Override
    public Clerks findByID(Long aLong) {
        return clerksRepository.findById(aLong).get();
    }

    @Override
    public Clerks add(Clerks object) {
        return clerksRepository.save(object);
    }

    @Override
    public void delete(Clerks object) {
        clerksRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        clerksRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Clerks object) {

    }
}
