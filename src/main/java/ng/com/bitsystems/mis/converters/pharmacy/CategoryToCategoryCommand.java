package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.CategoryCommand;
import ng.com.bitsystems.mis.models.pharmacy.Category;
import org.springframework.core.convert.converter.Converter;

public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {
    @Override
    public CategoryCommand convert(Category source) {
        return null;
    }
}
