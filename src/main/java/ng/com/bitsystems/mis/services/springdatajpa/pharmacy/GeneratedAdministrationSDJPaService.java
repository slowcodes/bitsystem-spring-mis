package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.GeneratedAdministration;
import ng.com.bitsystems.mis.repositories.pharmacy.GeneratedAdministrationRepository;
import ng.com.bitsystems.mis.services.pharmacy.GeneratedAdministrationService;

import java.util.HashSet;
import java.util.Set;

public class GeneratedAdministrationSDJPaService implements GeneratedAdministrationService {
    private GeneratedAdministrationRepository generatedAdministrationRepository;

    public GeneratedAdministrationSDJPaService(GeneratedAdministrationRepository generatedAdministrationRepository) {
        this.generatedAdministrationRepository = generatedAdministrationRepository;
    }

    @Override
    public Set<GeneratedAdministration> findAll() {
        Set<GeneratedAdministration> generatedAdministrations = new HashSet<>();
        generatedAdministrationRepository.findAll().forEach(generatedAdministrations::add);
        return generatedAdministrations;
    }

    @Override
    public GeneratedAdministration findByID(Long aLong) {
        return generatedAdministrationRepository.findById(aLong).get();
    }

    @Override
    public GeneratedAdministration add(GeneratedAdministration object) {
        return generatedAdministrationRepository.save(object);
    }

    @Override
    public void delete(GeneratedAdministration object) {
        generatedAdministrationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        generatedAdministrationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(GeneratedAdministration object) {

    }
}
