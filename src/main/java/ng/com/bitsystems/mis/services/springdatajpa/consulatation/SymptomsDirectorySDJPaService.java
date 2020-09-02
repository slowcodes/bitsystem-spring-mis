package ng.com.bitsystems.mis.services.springdatajpa.consulatation;

import ng.com.bitsystems.mis.models.consultation.SymptomsDirectory;
import ng.com.bitsystems.mis.repositories.consultations.SymptomsDirectoryRepository;
import ng.com.bitsystems.mis.services.consultations.SymptomsDirectoryService;

import java.util.HashSet;
import java.util.Set;

public class SymptomsDirectorySDJPaService implements SymptomsDirectoryService {
    private SymptomsDirectoryRepository symptomsDirectoryRepository;

    public SymptomsDirectorySDJPaService(SymptomsDirectoryRepository symptomsDirectoryRepository) {
        this.symptomsDirectoryRepository = symptomsDirectoryRepository;
    }

    @Override
    public Set<SymptomsDirectory> findAll() {
        Set<SymptomsDirectory> symptomsDirectory = new HashSet<>();
        symptomsDirectoryRepository.findAll().forEach(symptomsDirectory::add);
        return symptomsDirectory;
    }

    @Override
    public SymptomsDirectory findByID(Long aLong) {
        return symptomsDirectoryRepository.findById(aLong).get();
    }

    @Override
    public SymptomsDirectory add(SymptomsDirectory object) {
        return symptomsDirectoryRepository.save(object);
    }

    @Override
    public void delete(SymptomsDirectory object) {
        symptomsDirectoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        symptomsDirectoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(SymptomsDirectory object) {

    }
}
