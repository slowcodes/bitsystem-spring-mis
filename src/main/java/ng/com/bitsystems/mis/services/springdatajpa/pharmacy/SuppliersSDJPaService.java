package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.Suppliers;
import ng.com.bitsystems.mis.repositories.pharmacy.SuppliersRepository;
import ng.com.bitsystems.mis.services.pharmacy.SupplierService;

import java.util.HashSet;
import java.util.Set;

public class SuppliersSDJPaService implements SupplierService {
    private SuppliersRepository suppliersRepository;

    public SuppliersSDJPaService(SuppliersRepository suppliersRepository) {
        this.suppliersRepository = suppliersRepository;
    }

    @Override
    public Set<Suppliers> findAll() {
        Set<Suppliers> suppliers=new HashSet<>();
        suppliersRepository.findAll().forEach(suppliers::add);
        return suppliers;
    }

    @Override
    public Suppliers findByID(Long aLong) {
        return suppliersRepository.findById(aLong).get();
    }

    @Override
    public Suppliers add(Suppliers object) {
        return suppliersRepository.save(object);
    }

    @Override
    public void delete(Suppliers object) {
        suppliersRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        suppliersRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Suppliers object) {

    }
}
