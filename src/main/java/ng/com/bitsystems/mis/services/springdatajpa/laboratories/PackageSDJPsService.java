package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.LabPackages;
import ng.com.bitsystems.mis.repositories.laboratories.PackageRepository;
import ng.com.bitsystems.mis.services.laboratories.PackageService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class PackageSDJPsService implements PackageService {
    private PackageRepository packageRepository;

    public PackageSDJPsService(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    @Override
    public Set<LabPackages> findAll() {
        Set<LabPackages> aPackages = new HashSet<>();
        packageRepository.findAll().forEach(aPackages::add);
        return aPackages;
    }

    @Override
    public LabPackages findByID(Long aLong) {
        return packageRepository.findById(aLong).get();
    }

    @Override
    public LabPackages add(LabPackages object) {
        return packageRepository.save(object);
    }

    @Override
    public void delete(LabPackages object) {
        packageRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        packageRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(LabPackages object) {

    }
}
