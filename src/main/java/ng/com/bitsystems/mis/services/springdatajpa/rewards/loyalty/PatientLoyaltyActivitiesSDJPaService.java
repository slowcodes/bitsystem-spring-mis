package ng.com.bitsystems.mis.services.springdatajpa.rewards.loyalty;

import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyActivites;
import ng.com.bitsystems.mis.repositories.rewards.loyalties.PatientLoyaltyActivityRepository;
import ng.com.bitsystems.mis.services.rewards.loyalties.PatientLoyaltyActivityService;

import java.util.HashSet;
import java.util.Set;

public class PatientLoyaltyActivitiesSDJPaService implements PatientLoyaltyActivityService {
    private PatientLoyaltyActivityRepository patientLoyaltyActivityRepository;

    public PatientLoyaltyActivitiesSDJPaService(PatientLoyaltyActivityRepository patientLoyaltyActivityRepository) {
        this.patientLoyaltyActivityRepository = patientLoyaltyActivityRepository;
    }

    @Override
    public Set<PatientsLoyaltyActivites> findAll() {
        Set<PatientsLoyaltyActivites> patientsLoyaltyActivites = new HashSet<>();
        patientLoyaltyActivityRepository.findAll().forEach(patientsLoyaltyActivites::add);
        return patientsLoyaltyActivites;
    }

    @Override
    public PatientsLoyaltyActivites findByID(Long aLong) {
        return patientLoyaltyActivityRepository.findById(aLong).get();
    }

    @Override
    public PatientsLoyaltyActivites add(PatientsLoyaltyActivites object) {
        return patientLoyaltyActivityRepository.save(object);
    }

    @Override
    public void delete(PatientsLoyaltyActivites object) {
        patientLoyaltyActivityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientLoyaltyActivityRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsLoyaltyActivites object) {

    }
}
