package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.Sales;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.SalesRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.SalesService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SalesSDJPaService implements SalesService {
    private SalesRepository salesRepository;

    public SalesSDJPaService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @Override
    public Set<Sales> findAll() {
        Set<Sales> sales = new HashSet<>();
        salesRepository.findAll().forEach(sales::add);
        return sales;
    }

    @Override
    public Sales findByID(Long aLong) {
        return salesRepository.findById(aLong).get();
    }

    @Override
    public Sales add(Sales object) {
        return salesRepository.save(object);
    }

    @Override
    public void delete(Sales object) {
        salesRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        salesRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Sales object) {

    }
}
