package ng.com.bitsystems.mis.services.springdatajpa.admission.facilities;

import ng.com.bitsystems.mis.models.admissions.facilities.Facilities;
import ng.com.bitsystems.mis.repositories.admissions.facilities.FacilitiesRepository;
import ng.com.bitsystems.mis.services.admission.facilities.FacilityService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class FacilitySDJPaService implements FacilityService {
    private FacilitiesRepository facilitiesRepository;

    public FacilitySDJPaService(FacilitiesRepository facilitiesRepository) {
        this.facilitiesRepository = facilitiesRepository;
    }

    @Override
    public Set<Facilities> findAll() {
        Set<Facilities> facilities = new HashSet<>();
        facilitiesRepository.findAll().forEach(facilities::add);
        return facilities;
    }

    @Override
    public Facilities findByID(Long aLong) {
        return facilitiesRepository.findById(aLong).get();
    }

    @Override
    public Facilities add(Facilities object) {
        return facilitiesRepository.save(object);
    }

    @Override
    public void delete(Facilities object) {
        facilitiesRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        facilitiesRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Facilities object) {

    }
}
