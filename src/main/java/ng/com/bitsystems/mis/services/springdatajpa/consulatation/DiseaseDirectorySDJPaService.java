package ng.com.bitsystems.mis.services.springdatajpa.consulatation;

import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import ng.com.bitsystems.mis.repositories.consultations.DiseaseDirectoryRepository;
import ng.com.bitsystems.mis.services.consultations.DiseaseDirectoryService;

import java.util.HashSet;
import java.util.Set;

public class DiseaseDirectorySDJPaService implements DiseaseDirectoryService {
    private DiseaseDirectoryRepository  diseaseDirectoryRepository;

    public DiseaseDirectorySDJPaService(DiseaseDirectoryRepository diseaseDirectoryRepository) {
        this.diseaseDirectoryRepository = diseaseDirectoryRepository;
    }

    @Override
    public Set<DiseaseDirectory> findAll() {
        Set<DiseaseDirectory> diseaseDirectory = new HashSet<>();
        diseaseDirectoryRepository.findAll().forEach(diseaseDirectory::add);
        return diseaseDirectory;
    }

    @Override
    public DiseaseDirectory findByID(Long aLong) {
        return diseaseDirectoryRepository.findById(aLong).get();
    }

    @Override
    public DiseaseDirectory add(DiseaseDirectory object) {
        return diseaseDirectoryRepository.save(object);
    }

    @Override
    public void delete(DiseaseDirectory object) {
        diseaseDirectoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        diseaseDirectoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(DiseaseDirectory object) {

    }
}
