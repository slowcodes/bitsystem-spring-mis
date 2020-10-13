package ng.com.bitsystems.mis.services.springdatajpa.referrals;

import ng.com.bitsystems.mis.models.referrals.PatientsReferrals;
import ng.com.bitsystems.mis.repositories.referrals.PatientReferralRepository;
import ng.com.bitsystems.mis.services.referrals.PatientReferralService;

import java.util.HashSet;
import java.util.Set;

public class PatientReferralSDJPaService implements PatientReferralService {
    private PatientReferralRepository patientReferralRepository;

    public PatientReferralSDJPaService(PatientReferralRepository patientReferralRepository) {
        this.patientReferralRepository = patientReferralRepository;
    }

    @Override
    public Set<PatientsReferrals> findAll() {
        Set<PatientsReferrals> patientsReferrals = new HashSet<>();
        patientReferralRepository.findAll().forEach(patientsReferrals::add);
        return patientsReferrals;
    }

    @Override
    public PatientsReferrals findByID(Long aLong) {
        return patientReferralRepository.findById(aLong).get();
    }

    @Override
    public PatientsReferrals add(PatientsReferrals object) {
        return patientReferralRepository.save(object);
    }

    @Override
    public void delete(PatientsReferrals object) {
        patientReferralRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientReferralRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsReferrals object) {

    }
}
