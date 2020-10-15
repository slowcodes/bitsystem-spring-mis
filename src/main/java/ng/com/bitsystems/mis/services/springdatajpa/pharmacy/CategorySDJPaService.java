package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.Category;
import ng.com.bitsystems.mis.repositories.pharmacy.CategoryRepository;
import ng.com.bitsystems.mis.services.pharmacy.CategoryService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CategorySDJPaService implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategorySDJPaService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> findAll() {
        Set<Category> categories = new HashSet<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }

    @Override
    public Category findByID(Long aLong) {
        return categoryRepository.findById(aLong).get();
    }

    @Override
    public Category add(Category object) {
        return categoryRepository.save(object);
    }

    @Override
    public void delete(Category object) {
        categoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        categoryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Category object) {

    }
}
