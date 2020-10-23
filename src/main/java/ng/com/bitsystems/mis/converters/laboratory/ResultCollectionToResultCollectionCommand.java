package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ResultCollectionCommand;
import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;
import org.springframework.core.convert.converter.Converter;

public class ResultCollectionToResultCollectionCommand
implements Converter<ResultCollectionLog, ResultCollectionCommand> {
    @Override
    public ResultCollectionCommand convert(ResultCollectionLog source) {
        return null;
    }
}
