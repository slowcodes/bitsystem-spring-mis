package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.converters.laboratory.LaboratoryInvestigationCommandToLaboratoryInvestigation;
import ng.com.bitsystems.mis.models.laboratories.Investigations;
import ng.com.bitsystems.mis.repositories.laboratories.LaboratoryInvestigationRepository;
import ng.com.bitsystems.mis.services.laboratories.LaboratoryInvestigationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class LaboratoryInvestigationSDJPaService implements LaboratoryInvestigationService
{
    private LaboratoryInvestigationRepository investigationRepository;
    private LaboratoryInvestigationCommandToLaboratoryInvestigation laboratoryInvestigationCommandToLaboratoryInvestigation;

    public LaboratoryInvestigationSDJPaService(LaboratoryInvestigationRepository investigationRepository,
                                               LaboratoryInvestigationCommandToLaboratoryInvestigation laboratoryInvestigationCommandToLaboratoryInvestigation) {
        this.investigationRepository = investigationRepository;
        this.laboratoryInvestigationCommandToLaboratoryInvestigation = laboratoryInvestigationCommandToLaboratoryInvestigation;
    }

    @Override
    public Set<Investigations> findAll() {
        Set<Investigations> investigations = new HashSet<>();
        investigationRepository.findAll().forEach(investigations::add);
        return investigations;
    }

    @Override
    public Investigations findByID(Long aLong) {
        return investigationRepository.findById(aLong).get();
    }

    @Override
    public Investigations add(Investigations object) {
        return investigationRepository.save(object);
    }

    @Override
    public Investigations add(LaboratoryInvestigationCommand object) {
        return investigationRepository.save(laboratoryInvestigationCommandToLaboratoryInvestigation.convert(object));
    }

    @Override
    public void delete(Investigations object) {
        investigationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        investigationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Investigations object) {

    }
}
