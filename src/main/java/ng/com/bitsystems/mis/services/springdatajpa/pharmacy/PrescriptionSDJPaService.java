package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import ng.com.bitsystems.mis.repositories.pharmacy.PrescriptionRepository;
import ng.com.bitsystems.mis.services.pharmacy.PrescriptionService;

import java.util.HashSet;
import java.util.Set;

public class PrescriptionSDJPaService implements PrescriptionService {
    private PrescriptionRepository prescriptionRepository;

    public PrescriptionSDJPaService(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    @Override
    public Set<Prescription> findAll() {
        Set<Prescription> prescriptions = new HashSet<>();
        prescriptionRepository.findAll().forEach(prescriptions::add);
        return prescriptions;
    }

    @Override
    public Prescription findByID(Long aLong) {
        return prescriptionRepository.findById(aLong).get();
    }

    @Override
    public Prescription add(Prescription object) {
        return prescriptionRepository.save(object);
    }

    @Override
    public void delete(Prescription object) {
        prescriptionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        prescriptionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Prescription object) {

    }
}
