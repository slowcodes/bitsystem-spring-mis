package ng.com.bitsystems.mis.services.springdatajpa.rewards.loyalty;

import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyGains;
import ng.com.bitsystems.mis.repositories.rewards.loyalties.PatientLoyaltyGainRepository;
import ng.com.bitsystems.mis.services.rewards.loyalties.PatientLoyaltyGainService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PatientLoyaltyGainSDJPaService implements PatientLoyaltyGainService {
    private PatientLoyaltyGainRepository patientLoyaltyGainRepository;

    public PatientLoyaltyGainSDJPaService(PatientLoyaltyGainRepository patientLoyaltyGainRepository) {
        this.patientLoyaltyGainRepository = patientLoyaltyGainRepository;
    }

    @Override
    public Set<PatientsLoyaltyGains> findAll() {
        Set<PatientsLoyaltyGains> patientsLoyaltyGains = new HashSet<>();
        patientLoyaltyGainRepository.findAll().forEach(patientsLoyaltyGains::add);
        return patientsLoyaltyGains;
    }

    @Override
    public PatientsLoyaltyGains findByID(Long aLong) {
        return patientLoyaltyGainRepository.findById(aLong).get();
    }

    @Override
    public PatientsLoyaltyGains add(PatientsLoyaltyGains object) {
        return patientLoyaltyGainRepository.save(object);
    }

    @Override
    public void delete(PatientsLoyaltyGains object) {
        patientLoyaltyGainRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientLoyaltyGainRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsLoyaltyGains object) {

    }
}
