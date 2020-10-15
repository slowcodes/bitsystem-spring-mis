package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.FamilyFolder;
import ng.com.bitsystems.mis.repositories.patients.PatientsFamilyRepository;
import ng.com.bitsystems.mis.services.patients.PatientFamilyService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PatientFamilySDJPaService implements PatientFamilyService {
    private PatientsFamilyRepository patientsFamilyRepository;

    public PatientFamilySDJPaService(PatientsFamilyRepository patientsFamilyRepository) {
        this.patientsFamilyRepository = patientsFamilyRepository;
    }

    @Override
    public Set<FamilyFolder> findAll() {
        Set<FamilyFolder> patientsFamilies = new HashSet<>();
        patientsFamilyRepository.findAll().forEach(patientsFamilies::add);
        return patientsFamilies;
    }

    @Override
    public FamilyFolder findByID(Long aLong) {
        return patientsFamilyRepository.findById(aLong).get();
    }

    @Override
    public FamilyFolder add(FamilyFolder object) {
        return patientsFamilyRepository.save(object);
    }

    @Override
    public void delete(FamilyFolder object) {
        patientsFamilyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientsFamilyRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(FamilyFolder object) {

    }
}
