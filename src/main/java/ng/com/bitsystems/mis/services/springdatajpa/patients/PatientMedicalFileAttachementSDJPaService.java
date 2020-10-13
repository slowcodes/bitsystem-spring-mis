package ng.com.bitsystems.mis.services.springdatajpa.patients;

import ng.com.bitsystems.mis.models.patients.PatientsMedicalFileAttachment;
import ng.com.bitsystems.mis.repositories.patients.PatientsMedicalFileAttachmentRepository;
import ng.com.bitsystems.mis.services.patients.PatientMedicalFileAttachmentService;

import java.util.HashSet;
import java.util.Set;

public class PatientMedicalFileAttachementSDJPaService implements PatientMedicalFileAttachmentService {
    private PatientsMedicalFileAttachmentRepository fileAttachmentRepository;

    public PatientMedicalFileAttachementSDJPaService(PatientsMedicalFileAttachmentRepository fileAttachmentRepository) {
        this.fileAttachmentRepository = fileAttachmentRepository;
    }

    @Override
    public Set<PatientsMedicalFileAttachment> findAll() {
        Set<PatientsMedicalFileAttachment> patientsMedicalFileAttachments = new HashSet<>();
        fileAttachmentRepository.findAll().forEach(patientsMedicalFileAttachments::add);
        return patientsMedicalFileAttachments;
    }

    @Override
    public PatientsMedicalFileAttachment findByID(Long aLong) {
        return fileAttachmentRepository.findById(aLong).get();
    }

    @Override
    public PatientsMedicalFileAttachment add(PatientsMedicalFileAttachment object) {
        return fileAttachmentRepository.save(object);
    }

    @Override
    public void delete(PatientsMedicalFileAttachment object) {
        fileAttachmentRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        fileAttachmentRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PatientsMedicalFileAttachment object) {

    }
}
