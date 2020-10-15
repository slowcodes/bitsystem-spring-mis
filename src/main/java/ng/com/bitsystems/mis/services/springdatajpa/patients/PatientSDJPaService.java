package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.repositories.patients.PatientRepository;
import ng.com.bitsystems.mis.services.patients.PatientService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PatientSDJPaService implements PatientService {

    private PatientRepository patientRepository;

    public PatientSDJPaService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Set<Patients> findAll() {
        Set<Patients> patients = new HashSet<>();
        patientRepository.findAll().forEach(patients::add);
        return patients;
    }

    @Override
    public Patients findByID(Long aLong) {
        return patientRepository.findById(aLong).get();
    }

    @Override
    public Patients add(Patients object) {
        return patientRepository.save(object);
    }

    @Override
    public void delete(Patients object) {
        patientRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Patients object) {

    }
}
