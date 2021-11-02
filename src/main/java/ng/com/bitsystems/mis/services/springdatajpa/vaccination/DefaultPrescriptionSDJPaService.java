package ng.com.bitsystems.mis.services.springdatajpa.vaccination;

import ng.com.bitsystems.mis.models.vaccination.DefaultPrescription;
import ng.com.bitsystems.mis.repositories.vaccinations.DefaultPrescriptionRepository;
import ng.com.bitsystems.mis.services.vaccination.DefaultPrescriptionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DefaultPrescriptionSDJPaService implements DefaultPrescriptionService {

    private DefaultPrescriptionRepository defaultPrescriptionRepository;

    public DefaultPrescriptionSDJPaService(DefaultPrescriptionRepository defaultPrescriptionRepository) {
        this.defaultPrescriptionRepository = defaultPrescriptionRepository;
    }

    @Override
    public Set<DefaultPrescription> findAll() {
        Set<DefaultPrescription> vaccineSchedules = new HashSet<>();
        defaultPrescriptionRepository.findAll().forEach(vaccineSchedules::add);
        return vaccineSchedules;
    }

    @Override
    public DefaultPrescription findByID(Long aLong) {
        return defaultPrescriptionRepository.findById(aLong).get();
    }

    @Override
    public DefaultPrescription add(DefaultPrescription object) {
        return defaultPrescriptionRepository.save(object);
    }

    @Override
    public void delete(DefaultPrescription object) {
        defaultPrescriptionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        defaultPrescriptionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(DefaultPrescription object) {

    }
}
