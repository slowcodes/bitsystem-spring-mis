package ng.com.bitsystems.mis.services.springdatajpa.admission.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionAdministration;
import ng.com.bitsystems.mis.repositories.admissions.inpatients.InpatientPrescriptionAdministrationRepository;
import ng.com.bitsystems.mis.services.admission.inpatients.InpatientPrescriptionAdministrationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class

InpatientPrescriptionAdministrationSDJPaService implements InpatientPrescriptionAdministrationService {
    private InpatientPrescriptionAdministrationRepository administrationRepository;

    public InpatientPrescriptionAdministrationSDJPaService(InpatientPrescriptionAdministrationRepository administrationRepository) {
        this.administrationRepository = administrationRepository;
    }

    @Override
    public Set<InpatientPrescriptionAdministration> findAll() {
        Set<InpatientPrescriptionAdministration> prescriptionAdministrations = new HashSet<>();
        administrationRepository.findAll().forEach(prescriptionAdministrations::add);
        return prescriptionAdministrations;
    }

    @Override
    public InpatientPrescriptionAdministration findByID(Long aLong) {
        return administrationRepository.findById(aLong).get();
    }

    @Override
    public InpatientPrescriptionAdministration add(InpatientPrescriptionAdministration object) {
        return administrationRepository.save(object);
    }

    @Override
    public void delete(InpatientPrescriptionAdministration object) {
        administrationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        administrationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InpatientPrescriptionAdministration object) {

    }
}
