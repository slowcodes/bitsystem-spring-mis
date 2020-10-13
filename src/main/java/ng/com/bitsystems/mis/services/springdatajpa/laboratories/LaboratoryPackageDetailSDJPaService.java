package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.LaboratoryPackageDetails;
import ng.com.bitsystems.mis.repositories.laboratories.LaboratoryPackageDetailsRepository;
import ng.com.bitsystems.mis.services.laboratories.LaboratoryPackageDetailService;

import java.util.HashSet;
import java.util.Set;

public class LaboratoryPackageDetailSDJPaService implements LaboratoryPackageDetailService {

    private LaboratoryPackageDetailsRepository laboratoryPackageDetailsRepository;

    public LaboratoryPackageDetailSDJPaService(LaboratoryPackageDetailsRepository laboratoryPackageDetailsRepository) {
        this.laboratoryPackageDetailsRepository = laboratoryPackageDetailsRepository;
    }

    @Override
    public Set<LaboratoryPackageDetails> findAll() {
        Set<LaboratoryPackageDetails> laboratoryPackageDetails = new HashSet<>();
        laboratoryPackageDetailsRepository.findAll().forEach(laboratoryPackageDetails::add);
        return laboratoryPackageDetails;
    }

    @Override
    public LaboratoryPackageDetails findByID(Long aLong) {
        return laboratoryPackageDetailsRepository.findById(aLong).get();
    }

    @Override
    public LaboratoryPackageDetails add(LaboratoryPackageDetails object) {
        return laboratoryPackageDetailsRepository.save(object);
    }

    @Override
    public void delete(LaboratoryPackageDetails object) {
        laboratoryPackageDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        laboratoryPackageDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(LaboratoryPackageDetails object) {

    }
}
