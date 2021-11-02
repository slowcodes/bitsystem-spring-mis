package ng.com.bitsystems.mis.services.springdatajpa.transactions;

import ng.com.bitsystems.mis.models.transactions.ProductPrice;
import ng.com.bitsystems.mis.repositories.transactions.SalesTransactionRepository;
import ng.com.bitsystems.mis.services.transactions.SalesTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SalesTransactionSDJPaService implements SalesTransactionService {
    private SalesTransactionRepository salesTransactionRepository;

    public SalesTransactionSDJPaService(SalesTransactionRepository salesTransactionRepository) {
        this.salesTransactionRepository = salesTransactionRepository;
    }

    @Override
    public Set<ProductPrice> findAll() {
        Set <ProductPrice> goodsTransactions = new HashSet<>();
        salesTransactionRepository.findAll().forEach(goodsTransactions::add);
        return goodsTransactions;
    }

    @Override
    public ProductPrice findByID(Long aLong) {
        return salesTransactionRepository.findById(aLong).get();
    }

    @Override
    public ProductPrice add(ProductPrice object) {
        return salesTransactionRepository.save(object);
    }

    @Override
    public void delete(ProductPrice object) {
        salesTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        salesTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ProductPrice object) {

    }
}
