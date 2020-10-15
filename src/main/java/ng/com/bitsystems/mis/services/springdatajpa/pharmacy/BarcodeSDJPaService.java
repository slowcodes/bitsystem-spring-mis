package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.Barcodes;
import ng.com.bitsystems.mis.repositories.pharmacy.BarcodeRepository;
import ng.com.bitsystems.mis.services.pharmacy.BarcodeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BarcodeSDJPaService implements BarcodeService {
    private BarcodeRepository barcodeRepository;

    public BarcodeSDJPaService(BarcodeRepository barcodeRepository) {
        this.barcodeRepository = barcodeRepository;
    }

    @Override
    public Set<Barcodes> findAll() {
        Set<Barcodes> barcodes = new HashSet<>();
        barcodeRepository.findAll().forEach(barcodes::add);
        return barcodes;
    }

    @Override
    public Barcodes findByID(Long aLong) {
        return barcodeRepository.findById(aLong).get();
    }

    @Override
    public Barcodes add(Barcodes object) {
        return barcodeRepository.save(object);
    }

    @Override
    public void delete(Barcodes object) {
        barcodeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        barcodeRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Barcodes object) {

    }
}
