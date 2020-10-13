package ng.com.bitsystems.mis.services.springdatajpa.accounts.pricing;

import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import ng.com.bitsystems.mis.repositories.accounts.pricing.SalesPriceCodeRepository;
import ng.com.bitsystems.mis.services.accounts.pricing.SalesPriceCodeService;

import java.util.HashSet;
import java.util.Set;

public class SalePriceCodeSDJPaService implements SalesPriceCodeService {

    private SalesPriceCodeRepository salesPriceCodeRepository;

    public SalePriceCodeSDJPaService(SalesPriceCodeRepository salesPriceCodeRepository) {
        this.salesPriceCodeRepository = salesPriceCodeRepository;
    }

    @Override
    public Set<SalesPriceCode> findAll() {
        Set<SalesPriceCode> salesPriceCodes = new HashSet<>();
        salesPriceCodeRepository.findAll().forEach(salesPriceCodes::add);
        return salesPriceCodes;
    }

    @Override
    public SalesPriceCode findByID(Long aLong) {
        return salesPriceCodeRepository.findById(aLong).get();
    }

    @Override
    public SalesPriceCode add(SalesPriceCode object) {
        return salesPriceCodeRepository.save(object);
    }

    @Override
    public void delete(SalesPriceCode object) {
        salesPriceCodeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        salesPriceCodeRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(SalesPriceCode object) {

    }
}
