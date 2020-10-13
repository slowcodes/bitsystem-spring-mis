package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.PatientsSocialHistory;
import ng.com.bitsystems.mis.repositories.patients.PatientSocialHistoryRepository;
import ng.com.bitsystems.mis.services.patients.PatientSocialHistoryService;

import java.util.HashSet;
import java.util.Set;

public class PatientSociolHistorySDJPaService implements PatientSocialHistoryService {
    private PatientSocialHistoryRepository patientSocialHistoryRepository;

    public PatientSociolHistorySDJPaService(PatientSocialHistoryRepository patientSocialHistoryRepository) {
        this.patientSocialHistoryRepository = patientSocialHistoryRepository;
    }

    @Override
    public Set<PatientsSocialHistory> findAll() {
        Set<PatientsSocialHistory> patientsSocialHistories = new HashSet<>();
        patientSocialHistoryRepository.findAll().forEach(patientsSocialHistories::add);
        return patientsSocialHistories;
    }

    @Override
    public PatientsSocialHistory findByID(Long aLong) {
        return patientSocialHistoryRepository.findById(aLong).get();
    }

    @Override
    public PatientsSocialHistory add(PatientsSocialHistory object) {
        return patientSocialHistoryRepository.save(object);
    }

    @Override
    public void delete(PatientsSocialHistory object) {
        patientSocialHistoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientSocialHistoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsSocialHistory object) {

    }
}
