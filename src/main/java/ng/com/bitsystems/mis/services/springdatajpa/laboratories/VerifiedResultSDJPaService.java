package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import ng.com.bitsystems.mis.repositories.laboratories.VerifiedResultRepository;
import ng.com.bitsystems.mis.services.laboratories.VerifiedResultService;

import java.util.HashSet;
import java.util.Set;

public class VerifiedResultSDJPaService implements VerifiedResultService {
    private VerifiedResultRepository verifiedResultRepository;

    public VerifiedResultSDJPaService(VerifiedResultRepository verifiedResultRepository) {
        this.verifiedResultRepository = verifiedResultRepository;
    }

    @Override
    public Set<VerifiedResults> findAll() {
        Set<VerifiedResults> verifiedResults = new HashSet<>();
        verifiedResultRepository.findAll().forEach(verifiedResults::add);
        return verifiedResults;
    }

    @Override
    public VerifiedResults findByID(Long aLong) {
        return verifiedResultRepository.findById(aLong).get();
    }

    @Override
    public VerifiedResults add(VerifiedResults object) {
        return verifiedResultRepository.save(object);
    }

    @Override
    public void delete(VerifiedResults object) {
        verifiedResultRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        verifiedResultRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(VerifiedResults object) {

    }
}
