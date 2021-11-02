package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.Supplies;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.SupplyRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.SupplyService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SupplySDJPaService implements SupplyService {
    private SupplyRepository supplyRepository;

    public SupplySDJPaService(SupplyRepository supplyRepository) {
        this.supplyRepository = supplyRepository;
    }

    @Override
    public Set<Supplies> findAll() {
        Set<Supplies> supplies = new HashSet<>();
        supplyRepository.findAll().forEach(supplies::add);
        return supplies;
    }

    @Override
    public Supplies findByID(Long aLong) {
        return supplyRepository.findById(aLong).get();
    }

    @Override
    public Supplies add(Supplies object) {
        return supplyRepository.save(object);
    }

    @Override
    public void delete(Supplies object) {
        supplyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        supplyRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Supplies object) {

    }
}
