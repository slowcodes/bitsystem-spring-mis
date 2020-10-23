package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ResultCommand;
import ng.com.bitsystems.mis.models.laboratories.Results;
import org.springframework.core.convert.converter.Converter;

public class ResultToResultCommand implements Converter<Results, ResultCommand> {
    @Override
    public ResultCommand convert(Results source) {
        return null;
    }
}
