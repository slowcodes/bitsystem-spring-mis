package ng.com.bitsystems.mis.services.springdatajpa.vaccination;

import ng.com.bitsystems.mis.models.vaccination.VaccineAdministration;
import ng.com.bitsystems.mis.repositories.vaccinations.VaccineAdministrationRepository;
import ng.com.bitsystems.mis.services.vaccination.VaccineAdministrationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VaccineAdminstrationSDJPaService implements VaccineAdministrationService {

    private VaccineAdministrationRepository vaccineAdministrationRepository;

    public VaccineAdminstrationSDJPaService(VaccineAdministrationRepository vaccineAdministrationRepository) {
        this.vaccineAdministrationRepository = vaccineAdministrationRepository;
    }

    @Override
    public Set<VaccineAdministration> findAll() {
        Set<VaccineAdministration> vaccineAdministrations=new HashSet<>();
        vaccineAdministrationRepository.findAll().forEach(vaccineAdministrations::add);
        return vaccineAdministrations;
    }

    @Override
    public VaccineAdministration findByID(Long aLong) {
        return vaccineAdministrationRepository.findById(aLong).get();
    }

    @Override
    public VaccineAdministration add(VaccineAdministration object) {
        return vaccineAdministrationRepository.save(object);
    }

    @Override
    public void delete(VaccineAdministration object) {
        vaccineAdministrationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vaccineAdministrationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(VaccineAdministration object) {

    }
}
