package ng.com.bitsystems.mis.services.springdatajpa.admission.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptionGeneratedAdministration;
import ng.com.bitsystems.mis.repositories.admissions.outpatients.OutpatientPrescriptionGeneratedAdministrationRepository;
import ng.com.bitsystems.mis.services.admission.outpatients.OutpatientPrescriptionGeneratedAdministrationService;

import java.util.HashSet;
import java.util.Set;

public class OutpatientPrescriptionGeneratedAdmissionSDJPaService
implements OutpatientPrescriptionGeneratedAdministrationService {
    private OutpatientPrescriptionGeneratedAdministrationRepository generatedAdministrationRepository;

    public OutpatientPrescriptionGeneratedAdmissionSDJPaService(OutpatientPrescriptionGeneratedAdministrationRepository generatedAdministrationRepository) {
        this.generatedAdministrationRepository = generatedAdministrationRepository;
    }

    @Override
    public Set<OutpatientPrescriptionGeneratedAdministration> findAll() {
        Set<OutpatientPrescriptionGeneratedAdministration> prescriptionGeneratedAdministrations = new HashSet<>();
        generatedAdministrationRepository.findAll().forEach(prescriptionGeneratedAdministrations::add);
        return prescriptionGeneratedAdministrations;
    }

    @Override
    public OutpatientPrescriptionGeneratedAdministration findByID(Long aLong) {
        return generatedAdministrationRepository.findById(aLong).get();
    }

    @Override
    public OutpatientPrescriptionGeneratedAdministration add(OutpatientPrescriptionGeneratedAdministration object) {
        return generatedAdministrationRepository.save(object);
    }

    @Override
    public void delete(OutpatientPrescriptionGeneratedAdministration object) {
        generatedAdministrationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        generatedAdministrationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OutpatientPrescriptionGeneratedAdministration object) {

    }
}
