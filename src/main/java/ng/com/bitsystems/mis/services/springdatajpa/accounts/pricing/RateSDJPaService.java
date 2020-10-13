package ng.com.bitsystems.mis.services.springdatajpa.accounts.pricing;

import ng.com.bitsystems.mis.models.accounts.pricing.Rate;
import ng.com.bitsystems.mis.repositories.accounts.pricing.RateRepository;
import ng.com.bitsystems.mis.services.accounts.pricing.RateService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RateSDJPaService implements RateService {
    private RateRepository rateRepository;

    public RateSDJPaService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    @Override
    public Set<Rate> findAll() {
        Set<Rate> rates = new HashSet<>();
        rateRepository.findAll().forEach(rates::add);
        return rates;
    }

    @Override
    public Rate findByID(Long aLong) {
        return rateRepository.findById(aLong).get();
    }

    @Override
    public Rate add(Rate object) {
        return rateRepository.save(object);
    }

    @Override
    public void delete(Rate object) {
        rateRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        rateRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Rate object) {

    }
}
