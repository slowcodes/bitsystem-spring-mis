package ng.com.bitsystems.mis.services.springdatajpa.consulatation;

import ng.com.bitsystems.mis.models.consultation.ClerkingSymptoms;
import ng.com.bitsystems.mis.repositories.consultations.ClerkingSymptomsRepository;
import ng.com.bitsystems.mis.services.consultations.ClerkingSymptomsService;

import java.util.HashSet;
import java.util.Set;

public class ClerkingSymptonsSDJPaService implements ClerkingSymptomsService {
    private ClerkingSymptomsRepository clerkingSymptomsRepository;

    public ClerkingSymptonsSDJPaService(ClerkingSymptomsRepository clerkingSymptomsRepository) {
        this.clerkingSymptomsRepository = clerkingSymptomsRepository;
    }

    @Override
    public Set<ClerkingSymptoms> findAll() {
        Set<ClerkingSymptoms> clerkingSymptoms = new HashSet<>();
        clerkingSymptomsRepository.findAll().forEach(clerkingSymptoms::add);
        return clerkingSymptoms;
    }

    @Override
    public ClerkingSymptoms findByID(Long aLong) {
        return clerkingSymptomsRepository.findById(aLong).get();
    }

    @Override
    public ClerkingSymptoms add(ClerkingSymptoms object) {
        return clerkingSymptomsRepository.save(object);
    }

    @Override
    public void delete(ClerkingSymptoms object) {
        clerkingSymptomsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        clerkingSymptomsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ClerkingSymptoms object) {

    }
}
