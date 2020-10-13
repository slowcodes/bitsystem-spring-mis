package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.PatientDrugAllergy;
import ng.com.bitsystems.mis.repositories.patients.PatientsDrugAllergyRepository;
import ng.com.bitsystems.mis.services.patients.PatientDrugAllergyService;

import java.util.HashSet;
import java.util.Set;

public class PatientDrugAllegySDJPaService implements PatientDrugAllergyService {

    private PatientsDrugAllergyRepository patientsDrugAllergyRepository;

    public PatientDrugAllegySDJPaService(PatientsDrugAllergyRepository patientsDrugAllergyRepository) {
        this.patientsDrugAllergyRepository = patientsDrugAllergyRepository;
    }

    @Override
    public Set<PatientDrugAllergy> findAll() {
        Set<PatientDrugAllergy> patientDrugAllergies = new HashSet<>();
        patientsDrugAllergyRepository.findAll().forEach(patientDrugAllergies::add);
        return patientDrugAllergies;
    }

    @Override
    public PatientDrugAllergy findByID(Long aLong) {
        return patientsDrugAllergyRepository.findById(aLong).get();
    }

    @Override
    public PatientDrugAllergy add(PatientDrugAllergy object) {
        return patientsDrugAllergyRepository.save(object);
    }

    @Override
    public void delete(PatientDrugAllergy object) {
        patientsDrugAllergyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientsDrugAllergyRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientDrugAllergy object) {

    }
}
