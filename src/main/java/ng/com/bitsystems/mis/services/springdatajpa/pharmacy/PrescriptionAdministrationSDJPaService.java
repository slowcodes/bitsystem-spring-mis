package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.PrecriptionAdministration;
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
    public Set<PrecriptionAdministration> findAll() {
        Set<PrecriptionAdministration> precriptionAdministrations = new HashSet<>();
        prescriptionAdministrationRepository.findAll().forEach(precriptionAdministrations::add);
        return precriptionAdministrations;
    }

    @Override
    public PrecriptionAdministration findByID(Long aLong) {
        return prescriptionAdministrationRepository.findById(aLong).get();
    }

    @Override
    public PrecriptionAdministration add(PrecriptionAdministration object) {
        return prescriptionAdministrationRepository.save(object);
    }

    @Override
    public void delete(PrecriptionAdministration object) {
        prescriptionAdministrationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        prescriptionAdministrationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PrecriptionAdministration object) {

    }
}
