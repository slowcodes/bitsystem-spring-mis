package ng.com.bitsystems.mis.services.springdatajpa.admission.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionGeneratedAdministration;
import ng.com.bitsystems.mis.repositories.admissions.inpatients.InpatientPrescriptionGeneratedAdministrationRepository;
import ng.com.bitsystems.mis.services.admission.inpatients.InpatientPrescriptionGeneratedAdministrationService;

import java.util.HashSet;
import java.util.Set;

public class InpatientPrescriptionGeneratedAdministrationSDJPsService
implements InpatientPrescriptionGeneratedAdministrationService {
    private InpatientPrescriptionGeneratedAdministrationRepository generatedAdministrationRepository;
    @Override
    public Set<InpatientPrescriptionGeneratedAdministration> findAll() {
        Set<InpatientPrescriptionGeneratedAdministration> generatedAdministration = new HashSet<>();
        generatedAdministrationRepository.findAll().forEach(generatedAdministration::add);
        return null;
    }

    @Override
    public InpatientPrescriptionGeneratedAdministration findByID(Long aLong) {
        return generatedAdministrationRepository.findById(aLong).get();
    }

    @Override
    public InpatientPrescriptionGeneratedAdministration add(InpatientPrescriptionGeneratedAdministration object) {
        return generatedAdministrationRepository.save(object);
    }

    @Override
    public void delete(InpatientPrescriptionGeneratedAdministration object) {
        generatedAdministrationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        generatedAdministrationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InpatientPrescriptionGeneratedAdministration object) {

    }
}
