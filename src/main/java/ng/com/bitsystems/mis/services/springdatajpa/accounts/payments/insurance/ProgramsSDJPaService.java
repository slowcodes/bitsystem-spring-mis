package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.Programs;
import ng.com.bitsystems.mis.repositories.accounts.payments.insurance.ProgramsRepository;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.ProgramsService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ProgramsSDJPaService implements ProgramsService {

    private ProgramsRepository programsRepository;

    public ProgramsSDJPaService(ProgramsRepository programsRepository) {
        this.programsRepository = programsRepository;
    }

    @Override
    public Set<Programs> findAll() {
        Set<Programs> programs = new HashSet<>();
        programsRepository.findAll().forEach(programs::add);
        return programs;
    }

    @Override
    public Programs findByID(Long aLong) {
        return programsRepository.findById(aLong).get();
    }

    @Override
    public Programs add(Programs object) {
        return programsRepository.save(object);
    }

    @Override
    public void delete(Programs object) {
        programsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        programsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Programs object) {

    }
}
