package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.CategoryCommand;
import ng.com.bitsystems.mis.models.pharmacy.Category;
import org.springframework.core.convert.converter.Converter;

public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {
    @Override
    public Category convert(CategoryCommand source) {
        return null;
    }
}
