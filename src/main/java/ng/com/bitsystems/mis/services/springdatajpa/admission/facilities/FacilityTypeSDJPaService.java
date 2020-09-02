package ng.com.bitsystems.mis.services.springdatajpa.admission.facilities;

import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypes;
import ng.com.bitsystems.mis.repositories.admissions.facilities.FacilityTypesRepository;
import ng.com.bitsystems.mis.services.admission.facilities.FacilityTypeService;

import java.util.HashSet;
import java.util.Set;

public class FacilityTypeSDJPaService implements FacilityTypeService {

    private FacilityTypesRepository facilityTypesRepository;

    public FacilityTypeSDJPaService(FacilityTypesRepository facilityTypesRepository) {
        this.facilityTypesRepository = facilityTypesRepository;
    }

    @Override
    public Set<FacilityTypes> findAll() {
        Set<FacilityTypes> facilityTypes = new HashSet<>();
        facilityTypesRepository.findAll().forEach(facilityTypes::add);
        return facilityTypes;
    }

    @Override
    public FacilityTypes findByID(Long aLong) {
        return facilityTypesRepository.findById(aLong).get();
    }

    @Override
    public FacilityTypes add(FacilityTypes object) {
        return facilityTypesRepository.save(object);
    }

    @Override
    public void delete(FacilityTypes object) {
        facilityTypesRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        facilityTypesRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(FacilityTypes object) {

    }
}
