package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import ng.com.bitsystems.mis.repositories.patients.PatientMedicalHistoryRepository;
import ng.com.bitsystems.mis.services.patients.PatientMedicalHistoryService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PatientMedicalHistorySDJPaService implements PatientMedicalHistoryService {

    private PatientMedicalHistoryRepository historyRepository;

    public PatientMedicalHistorySDJPaService(PatientMedicalHistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    @Override
    public Set<PatientsMedicalHistory> findAll() {
        Set<PatientsMedicalHistory> patientsMedicalHistories = new HashSet<>();
        historyRepository.findAll().forEach(patientsMedicalHistories::add);
        return patientsMedicalHistories;
    }

    @Override
    public PatientsMedicalHistory findByID(Long aLong) {

        return historyRepository.findById(aLong).get();
    }

    @Override
    public PatientsMedicalHistory add(PatientsMedicalHistory object) {
        return historyRepository.save(object);
    }

    @Override
    public void delete(PatientsMedicalHistory object) {
        historyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        historyRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsMedicalHistory object) {

    }
}
