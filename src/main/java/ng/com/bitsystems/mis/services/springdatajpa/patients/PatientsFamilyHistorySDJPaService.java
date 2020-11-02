package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.FamilyHistory;
import ng.com.bitsystems.mis.repositories.patients.PatientFamilyHistoryRepository;
import ng.com.bitsystems.mis.services.patients.PatientFamilyHistoryService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class PatientsFamilyHistorySDJPaService implements PatientFamilyHistoryService {

    private PatientFamilyHistoryRepository patientFamilyHistoryRepository;

    public PatientsFamilyHistorySDJPaService(PatientFamilyHistoryRepository patientFamilyHistoryRepository) {
        this.patientFamilyHistoryRepository = patientFamilyHistoryRepository;
    }

    @Override
    public Set<FamilyHistory> findAll() {
        Set<FamilyHistory> patientsFamilyHistories = new HashSet<>();
        patientFamilyHistoryRepository.findAll().forEach(patientsFamilyHistories::add);
        return patientsFamilyHistories;
    }

    @Override
    public FamilyHistory findByID(Long aLong) {
        return patientFamilyHistoryRepository.findById(aLong).get();
    }

    @Override
    public FamilyHistory add(FamilyHistory object) {
        return patientFamilyHistoryRepository.save(object);
    }

    @Override
    public void delete(FamilyHistory object) {
        patientFamilyHistoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientFamilyHistoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(FamilyHistory object) {

    }
}
