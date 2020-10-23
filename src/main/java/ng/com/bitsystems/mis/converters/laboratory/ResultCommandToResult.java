package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ResultCommand;
import ng.com.bitsystems.mis.models.laboratories.Results;
import org.springframework.core.convert.converter.Converter;

public class ResultCommandToResult implements Converter<ResultCommand, Results> {
    @Override
    public Results convert(ResultCommand source) {
        return null;
    }
}
