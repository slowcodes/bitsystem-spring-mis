package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.Packages;
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
    public Set<Packages> findAll() {
        Set<Packages> packages = new HashSet<>();
        packageRepository.findAll().forEach(packages::add);
        return packages;
    }

    @Override
    public Packages findByID(Long aLong) {
        return packageRepository.findById(aLong).get();
    }

    @Override
    public Packages add(Packages object) {
        return packageRepository.save(object);
    }

    @Override
    public void delete(Packages object) {
        packageRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        packageRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Packages object) {

    }
}
