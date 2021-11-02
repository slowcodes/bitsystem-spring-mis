package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ResultCollectionCommand;
import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ResultCollectionToResultCollectionCommand
implements Converter<ResultCollectionLog, ResultCollectionCommand> {

    private ResultToResultCommand resultToResultCommand;

    public ResultCollectionToResultCollectionCommand(ResultToResultCommand resultToResultCommand) {
        this.resultToResultCommand = resultToResultCommand;
    }

    @Nullable
    @Override
    public ResultCollectionCommand convert(ResultCollectionLog source) {
        if(source==null)
            return null;

        final ResultCollectionCommand resultCollectionCommand= new ResultCollectionCommand();
        resultCollectionCommand.setId(source.getId());
        resultCollectionCommand.setResultCommand(resultToResultCommand.convert(source.getResult()));
        resultCollectionCommand.setTimeOfCollection(source.getTimeOfCollection());

        if(source.getAppUsers()!=null){
            resultCollectionCommand.setUserId(source.getAppUsers().getId());
        }

        return resultCollectionCommand;
    }
}
