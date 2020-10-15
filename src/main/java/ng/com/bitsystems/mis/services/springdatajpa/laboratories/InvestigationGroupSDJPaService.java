package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.InvestigationGroups;
import ng.com.bitsystems.mis.repositories.laboratories.InvestigationGroupsRepository;
import ng.com.bitsystems.mis.services.laboratories.InvestigationGroupService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InvestigationGroupSDJPaService implements InvestigationGroupService {

    private InvestigationGroupsRepository investigationGroupsRepository;

    public InvestigationGroupSDJPaService(InvestigationGroupsRepository investigationGroupsRepository) {
        this.investigationGroupsRepository = investigationGroupsRepository;
    }

    @Override
    public Set<InvestigationGroups> findAll() {
        Set<InvestigationGroups> investigationGroups = new HashSet<>();
        investigationGroupsRepository.findAll().forEach(investigationGroups::add);
        return investigationGroups;
    }

    @Override
    public InvestigationGroups findByID(Long aLong) {
        return investigationGroupsRepository.findById(aLong).get();
    }

    @Override
    public InvestigationGroups add(InvestigationGroups object) {
        return investigationGroupsRepository.save(object);
    }

    @Override
    public void delete(InvestigationGroups object) {
        investigationGroupsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        investigationGroupsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InvestigationGroups object) {

    }
}
