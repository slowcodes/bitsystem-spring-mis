package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.PatientsFamily;
import ng.com.bitsystems.mis.repositories.patients.PatientsFamilyRepository;
import ng.com.bitsystems.mis.services.patients.PatientFamilyService;

import java.util.HashSet;
import java.util.Set;

public class PatientFamilySDJPaService implements PatientFamilyService {
    private PatientsFamilyRepository patientsFamilyRepository;

    public PatientFamilySDJPaService(PatientsFamilyRepository patientsFamilyRepository) {
        this.patientsFamilyRepository = patientsFamilyRepository;
    }

    @Override
    public Set<PatientsFamily> findAll() {
        Set<PatientsFamily> patientsFamilies = new HashSet<>();
        patientsFamilyRepository.findAll().forEach(patientsFamilies::add);
        return patientsFamilies;
    }

    @Override
    public PatientsFamily findByID(Long aLong) {
        return patientsFamilyRepository.findById(aLong).get();
    }

    @Override
    public PatientsFamily add(PatientsFamily object) {
        return patientsFamilyRepository.save(object);
    }

    @Override
    public void delete(PatientsFamily object) {
        patientsFamilyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientsFamilyRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsFamily object) {

    }
}
