package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ResultCollectionCommand;
import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;
import org.springframework.core.convert.converter.Converter;

public class ResultCollectionCommandToResultCollection implements Converter<ResultCollectionCommand, ResultCollectionLog> {
    @Override
    public ResultCollectionLog convert(ResultCollectionCommand source) {
        return null;
    }
}
