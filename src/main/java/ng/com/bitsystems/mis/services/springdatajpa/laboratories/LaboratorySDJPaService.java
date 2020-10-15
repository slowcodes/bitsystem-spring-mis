package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.Laboratories;
import ng.com.bitsystems.mis.repositories.laboratories.LaboratoriesRepository;
import ng.com.bitsystems.mis.services.laboratories.LaboratoryService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class LaboratorySDJPaService implements LaboratoryService {
    private LaboratoriesRepository laboratoriesRepository;

    public LaboratorySDJPaService(LaboratoriesRepository laboratoriesRepository) {
        this.laboratoriesRepository = laboratoriesRepository;
    }

    @Override
    public Set<Laboratories> findAll() {
        Set<Laboratories> laboratories = new HashSet<>();
        laboratoriesRepository.findAll().forEach(laboratories::add);
        return laboratories;
    }

    @Override
    public Laboratories findByID(Long aLong) {
        return laboratoriesRepository.findById(aLong).get();
    }

    @Override
    public Laboratories add(Laboratories object) {
        return laboratoriesRepository.save(object);
    }

    @Override
    public void delete(Laboratories object) {
        laboratoriesRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        laboratoriesRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Laboratories object) {

    }
}
