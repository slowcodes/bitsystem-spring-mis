package ng.com.bitsystems.mis.services.springdatajpa.inventory.requisitions;

import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import ng.com.bitsystems.mis.repositories.inventory.requests.RequisitionRepository;
import ng.com.bitsystems.mis.services.inventory.requests.RequisitionService;

import java.util.HashSet;
import java.util.Set;

public class RequisitionSDJPaService implements RequisitionService {
    private RequisitionRepository requisitionRepository;

    public RequisitionSDJPaService(RequisitionRepository requisitionRepository) {
        this.requisitionRepository = requisitionRepository;
    }

    @Override
    public Set<Requisitions> findAll() {
        Set<Requisitions> requisitions = new HashSet<>();
        requisitionRepository.findAll().forEach(requisitions::add);
        return requisitions;
    }

    @Override
    public Requisitions findByID(Long aLong) {
        return requisitionRepository.findById(aLong).get();
    }

    @Override
    public Requisitions add(Requisitions object) {
        return requisitionRepository.save(object);
    }

    @Override
    public void delete(Requisitions object) {
        requisitionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        requisitionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Requisitions object) {

    }
}
