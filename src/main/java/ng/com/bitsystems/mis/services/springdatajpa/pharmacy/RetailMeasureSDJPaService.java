package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.RetailMeasure;
import ng.com.bitsystems.mis.repositories.pharmacy.RetailMeasureRepository;
import ng.com.bitsystems.mis.services.pharmacy.RetailMeasureService;

import java.util.HashSet;
import java.util.Set;

public class RetailMeasureSDJPaService implements RetailMeasureService {
    private RetailMeasureRepository retailMeasureRepository;

    public RetailMeasureSDJPaService(RetailMeasureRepository retailMeasureRepository) {
        this.retailMeasureRepository = retailMeasureRepository;
    }

    @Override
    public Set<RetailMeasure> findAll() {
        Set<RetailMeasure> retailMeasures = new HashSet<>();
        retailMeasureRepository.findAll().forEach(retailMeasures::add);
        return retailMeasures;
    }

    @Override
    public RetailMeasure findByID(Long aLong) {
        return retailMeasureRepository.findById(aLong).get();
    }

    @Override
    public RetailMeasure add(RetailMeasure object) {
        return retailMeasureRepository.save(object);
    }

    @Override
    public void delete(RetailMeasure object) {
        retailMeasureRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        retailMeasureRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(RetailMeasure object) {

    }
}
