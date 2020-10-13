package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.PatientsMedicalActivityListing;
import ng.com.bitsystems.mis.repositories.patients.PatientMedicalActivityListingRepository;
import ng.com.bitsystems.mis.services.patients.PatientMedicalActivityListingService;

import java.util.HashSet;
import java.util.Set;

public class PatientMedicalActivityListingSDJPaService implements PatientMedicalActivityListingService {

    private PatientMedicalActivityListingRepository patientMedicalActivityListingRepository;

    public PatientMedicalActivityListingSDJPaService(PatientMedicalActivityListingRepository patientMedicalActivityListingRepository) {
        this.patientMedicalActivityListingRepository = patientMedicalActivityListingRepository;
    }

    @Override
    public Set<PatientsMedicalActivityListing> findAll() {
        Set<PatientsMedicalActivityListing> patientsMedicalActivityListings = new HashSet<>();
        patientMedicalActivityListingRepository.findAll().forEach(patientsMedicalActivityListings::add);
        return patientsMedicalActivityListings;
    }

    @Override
    public PatientsMedicalActivityListing findByID(Long aLong) {
        return patientMedicalActivityListingRepository.findById(aLong).get();
    }

    @Override
    public PatientsMedicalActivityListing add(PatientsMedicalActivityListing object) {
        return patientMedicalActivityListingRepository.save(object);
    }

    @Override
    public void delete(PatientsMedicalActivityListing object) {
        patientMedicalActivityListingRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        patientMedicalActivityListingRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsMedicalActivityListing object) {

    }
}
