package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.PatientsFamilyHistory;
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
    public Set<PatientsFamilyHistory> findAll() {
        Set<PatientsFamilyHistory> patientsFamilyHistories = new HashSet<>();
        patientFamilyHistoryRepository.findAll().forEach(patientsFamilyHistories::add);
        return patientsFamilyHistories;
    }

    @Override
    public PatientsFamilyHistory findByID(Long aLong) {
        return patientFamilyHistoryRepository.findById(aLong).get();
    }

    @Override
    public PatientsFamilyHistory add(PatientsFamilyHistory object) {
        return patientFamilyHistoryRepository.save(object);
    }

    @Override
    public void delete(PatientsFamilyHistory object) {
        patientFamilyHistoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientFamilyHistoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsFamilyHistory object) {

    }
}
