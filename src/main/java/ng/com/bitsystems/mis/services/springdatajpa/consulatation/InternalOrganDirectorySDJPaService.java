package ng.com.bitsystems.mis.services.springdatajpa.consulatation;

import ng.com.bitsystems.mis.models.consultation.InternalOrgansDirectory;
import ng.com.bitsystems.mis.repositories.consultations.InternalOrganDirectoryRepository;
import ng.com.bitsystems.mis.services.consultations.InternalOrganDirectoryService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InternalOrganDirectorySDJPaService implements InternalOrganDirectoryService {
    private InternalOrganDirectoryRepository internalOrganDirectoryRepository;

    public InternalOrganDirectorySDJPaService(InternalOrganDirectoryRepository internalOrganDirectoryRepository) {
        this.internalOrganDirectoryRepository = internalOrganDirectoryRepository;
    }

    @Override
    public Set<InternalOrgansDirectory> findAll() {
        Set<InternalOrgansDirectory> internalOrgansDirectory = new HashSet<>();
        internalOrganDirectoryRepository.findAll().forEach(internalOrgansDirectory::add);
        return internalOrgansDirectory;
    }

    @Override
    public InternalOrgansDirectory findByID(Long aLong) {
        return internalOrganDirectoryRepository.findById(aLong).get();
    }

    @Override
    public InternalOrgansDirectory add(InternalOrgansDirectory object) {
        return internalOrganDirectoryRepository.save(object);
    }

    @Override
    public void delete(InternalOrgansDirectory object) {
        internalOrganDirectoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        internalOrganDirectoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InternalOrgansDirectory object) {

    }
}
