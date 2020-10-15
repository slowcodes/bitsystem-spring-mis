package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.PrescriptionAdministration;
import ng.com.bitsystems.mis.repositories.pharmacy.PrescriptionAdministrationRepository;
import ng.com.bitsystems.mis.services.pharmacy.PrescriptionAdministrationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PrescriptionAdministrationSDJPaService implements PrescriptionAdministrationService {
    private PrescriptionAdministrationRepository prescriptionAdministrationRepository;

    public PrescriptionAdministrationSDJPaService(PrescriptionAdministrationRepository prescriptionAdministrationRepository) {
        this.prescriptionAdministrationRepository = prescriptionAdministrationRepository;
    }

    @Override
    public Set<PrescriptionAdministration> findAll() {
        Set<PrescriptionAdministration> prescriptionAdministrations = new HashSet<>();
        prescriptionAdministrationRepository.findAll().forEach(prescriptionAdministrations::add);
        return prescriptionAdministrations;
    }

    @Override
    public PrescriptionAdministration findByID(Long aLong) {
        return prescriptionAdministrationRepository.findById(aLong).get();
    }

    @Override
    public PrescriptionAdministration add(PrescriptionAdministration object) {
        return prescriptionAdministrationRepository.save(object);
    }

    @Override
    public void delete(PrescriptionAdministration object) {
        prescriptionAdministrationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        prescriptionAdministrationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PrescriptionAdministration object) {

    }
}
