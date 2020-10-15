package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import ng.com.bitsystems.mis.repositories.laboratories.LaboratoryInvestigationRepository;
import ng.com.bitsystems.mis.services.laboratories.LaboratoryInvestigationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class LaboratoryInvestigationSDJPaService implements LaboratoryInvestigationService
{
    private LaboratoryInvestigationRepository investigationRepository;

    public LaboratoryInvestigationSDJPaService(LaboratoryInvestigationRepository investigationRepository) {
        this.investigationRepository = investigationRepository;
    }

    @Override
    public Set<LaboratoryInvestigations> findAll() {
        Set<LaboratoryInvestigations> laboratoryInvestigations = new HashSet<>();
        investigationRepository.findAll().forEach(laboratoryInvestigations::add);
        return laboratoryInvestigations;
    }

    @Override
    public LaboratoryInvestigations findByID(Long aLong) {
        return investigationRepository.findById(aLong).get();
    }

    @Override
    public LaboratoryInvestigations add(LaboratoryInvestigations object) {
        return investigationRepository.save(object);
    }

    @Override
    public void delete(LaboratoryInvestigations object) {
        investigationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        investigationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(LaboratoryInvestigations object) {

    }
}
