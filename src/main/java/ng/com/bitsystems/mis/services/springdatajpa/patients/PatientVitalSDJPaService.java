package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.PatientsVitals;
import ng.com.bitsystems.mis.repositories.patients.PatientVitalsRepository;
import ng.com.bitsystems.mis.services.patients.PatientVitalsService;

import java.util.HashSet;
import java.util.Set;

public class PatientVitalSDJPaService implements PatientVitalsService {

    private PatientVitalsRepository patientVitalsRepository;

    public PatientVitalSDJPaService(PatientVitalsRepository patientVitalsRepository) {
        this.patientVitalsRepository = patientVitalsRepository;
    }

    @Override
    public Set<PatientsVitals> findAll() {
        Set<PatientsVitals> patientsVitals= new HashSet<>();
        patientVitalsRepository.findAll().forEach(patientsVitals::add);
        return patientsVitals;
    }

    @Override
    public PatientsVitals findByID(Long aLong) {

        return patientVitalsRepository.findById(aLong).get();
    }

    @Override
    public PatientsVitals add(PatientsVitals object) {
        return patientVitalsRepository.save(object);
    }

    @Override
    public void delete(PatientsVitals object) {
        patientVitalsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientVitalsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsVitals object) {

    }
}
