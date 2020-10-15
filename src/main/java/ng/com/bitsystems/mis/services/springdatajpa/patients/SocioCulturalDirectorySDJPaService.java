package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.SocioCulturalDirectory;
import ng.com.bitsystems.mis.repositories.patients.SocioCulturalDirectoryRepository;
import ng.com.bitsystems.mis.services.patients.SocioCulturalDirectoryService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SocioCulturalDirectorySDJPaService implements SocioCulturalDirectoryService {

    private SocioCulturalDirectoryRepository socioCulturalDirectoryRepository;

    public SocioCulturalDirectorySDJPaService(SocioCulturalDirectoryRepository socioCulturalDirectoryRepository) {
        this.socioCulturalDirectoryRepository = socioCulturalDirectoryRepository;
    }

    @Override
    public Set<SocioCulturalDirectory> findAll() {
        Set<SocioCulturalDirectory> socioCulturalDirectories = new HashSet<>();
        socioCulturalDirectoryRepository.findAll().forEach(socioCulturalDirectories::add);
        return socioCulturalDirectories;
    }

    @Override
    public SocioCulturalDirectory findByID(Long aLong) {
        return socioCulturalDirectoryRepository.findById(aLong).get();
    }

    @Override
    public SocioCulturalDirectory add(SocioCulturalDirectory object) {
        return socioCulturalDirectoryRepository.save(object);
    }

    @Override
    public void delete(SocioCulturalDirectory object) {
        socioCulturalDirectoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        socioCulturalDirectoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(SocioCulturalDirectory object) {

    }
}
