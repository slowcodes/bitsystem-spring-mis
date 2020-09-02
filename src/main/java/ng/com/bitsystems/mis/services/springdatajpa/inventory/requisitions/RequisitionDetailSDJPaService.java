package ng.com.bitsystems.mis.services.springdatajpa.inventory.requisitions;

import ng.com.bitsystems.mis.models.inventory.requests.RequisitionDetails;
import ng.com.bitsystems.mis.repositories.inventory.requests.RequisitionDetailsRepository;
import ng.com.bitsystems.mis.services.inventory.requests.RequisitionDetailService;

import java.util.HashSet;
import java.util.Set;

public class RequisitionDetailSDJPaService implements RequisitionDetailService {
    private RequisitionDetailsRepository requisitionDetailsRepository;

    public RequisitionDetailSDJPaService(RequisitionDetailsRepository requisitionDetailsRepository) {
        this.requisitionDetailsRepository = requisitionDetailsRepository;
    }

    @Override
    public Set<RequisitionDetails> findAll() {
        Set<RequisitionDetails> requisitionDetails = new HashSet<>();
        requisitionDetailsRepository.findAll().forEach(requisitionDetails::add);

        return requisitionDetails;
    }

    @Override
    public RequisitionDetails findByID(Long aLong) {
        return requisitionDetailsRepository.findById(aLong).get();
    }

    @Override
    public RequisitionDetails add(RequisitionDetails object) {
        return requisitionDetailsRepository.save(object);
    }

    @Override
    public void delete(RequisitionDetails object) {
        requisitionDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        requisitionDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(RequisitionDetails object) {

    }
}
