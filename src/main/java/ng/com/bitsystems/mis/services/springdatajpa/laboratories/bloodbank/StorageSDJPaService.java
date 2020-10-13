package ng.com.bitsystems.mis.services.springdatajpa.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import ng.com.bitsystems.mis.repositories.laboratories.bloodbank.StorageRepository;
import ng.com.bitsystems.mis.services.laboratories.bloodbank.StorageService;

import java.util.HashSet;
import java.util.Set;

public class StorageSDJPaService implements StorageService {

    private StorageRepository storageRepository;

    public StorageSDJPaService(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    @Override
    public Set<Storage> findAll() {
        Set<Storage> storages = new HashSet<>();
        storageRepository.findAll().forEach(storages::add);
        return storages;
    }

    @Override
    public Storage findByID(Long aLong) {
        return storageRepository.findById(aLong).get();
    }

    @Override
    public Storage add(Storage object) {
        return storageRepository.save(object);
    }

    @Override
    public void delete(Storage object) {
        storageRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        storageRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Storage object) {

    }
}
