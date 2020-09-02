package ng.com.bitsystems.mis.services.springdatajpa.consulatation;

import ng.com.bitsystems.mis.models.consultation.Specializations;
import ng.com.bitsystems.mis.repositories.consultations.SpecializationRepository;
import ng.com.bitsystems.mis.services.consultations.SpecializationService;

import java.util.HashSet;
import java.util.Set;

public class SpecializationSDJPaService implements SpecializationService {
    private SpecializationRepository specializationRepository;

    public SpecializationSDJPaService(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }

    @Override
    public Set<Specializations> findAll() {
        Set<Specializations> specializations = new HashSet<>();
        specializationRepository.findAll().forEach(specializations::add);
        return specializations;
    }

    @Override
    public Specializations findByID(Long aLong) {
        return specializationRepository.findById(aLong).get();
    }

    @Override
    public Specializations add(Specializations object) {
        return specializationRepository.save(object);
    }

    @Override
    public void delete(Specializations object) {
        specializationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specializationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Specializations object) {

    }
}
