package ng.com.bitsystems.mis.services.springdatajpa.vaccination;

import ng.com.bitsystems.mis.models.vaccination.Vaccines;
import ng.com.bitsystems.mis.repositories.vaccinations.VaccineRepository;
import ng.com.bitsystems.mis.services.vaccination.VaccineService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VaccineSDJPaService implements VaccineService {
    private VaccineRepository vaccineRepository;

    public VaccineSDJPaService(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }

    @Override
    public Set<Vaccines> findAll() {
        Set<Vaccines> vaccines = new HashSet<>();
        vaccineRepository.findAll().forEach(vaccines::add);
        return vaccines;
    }

    @Override
    public Vaccines findByID(Long aLong) {
        return vaccineRepository.findById(aLong).get();
    }

    @Override
    public Vaccines add(Vaccines object) {
        return vaccineRepository.save(object);
    }

    @Override
    public void delete(Vaccines object) {
        vaccineRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vaccineRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Vaccines object) {

    }
}
