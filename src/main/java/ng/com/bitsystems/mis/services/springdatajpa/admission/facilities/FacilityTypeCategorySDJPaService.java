package ng.com.bitsystems.mis.services.springdatajpa.admission.facilities;

import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypeCategory;
import ng.com.bitsystems.mis.repositories.admissions.facilities.FacilityTypeCategoryRepository;
import ng.com.bitsystems.mis.services.admission.facilities.FacilityTypeCategoryService;

import java.util.HashSet;
import java.util.Set;

public class FacilityTypeCategorySDJPaService implements FacilityTypeCategoryService {
    private FacilityTypeCategoryRepository facilityTypeCategoryRepository;

    public FacilityTypeCategorySDJPaService(FacilityTypeCategoryRepository facilityTypeCategoryRepository) {
        this.facilityTypeCategoryRepository = facilityTypeCategoryRepository;
    }

    @Override
    public Set<FacilityTypeCategory> findAll() {
        Set<FacilityTypeCategory> facilityTypeCategories = new HashSet<>();
        facilityTypeCategoryRepository.findAll().forEach(facilityTypeCategories::add);
        return facilityTypeCategories;
    }

    @Override
    public FacilityTypeCategory findByID(Long aLong) {
        return facilityTypeCategoryRepository.findById(aLong).get();
    }

    @Override
    public FacilityTypeCategory add(FacilityTypeCategory object) {
        return facilityTypeCategoryRepository.save(object);
    }

    @Override
    public void delete(FacilityTypeCategory object) {
        facilityTypeCategoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        facilityTypeCategoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(FacilityTypeCategory object) {

    }
}
