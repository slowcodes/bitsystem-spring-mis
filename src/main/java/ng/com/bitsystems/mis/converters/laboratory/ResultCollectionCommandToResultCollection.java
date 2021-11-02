package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ResultCollectionCommand;
import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ResultCollectionCommandToResultCollection implements Converter<ResultCollectionCommand, ResultCollectionLog> {

    private ResultCommandToResult resultCommandToResult;

    @Nullable
    @Override
    public ResultCollectionLog convert(ResultCollectionCommand source) {

        if(source==null){
            return null;
        }

        final ResultCollectionLog collectionLog=new ResultCollectionLog();

        collectionLog.setId(source.getId());
        collectionLog.setTimeOfCollection(source.getTimeOfCollection());
        collectionLog.setResult(resultCommandToResult.convert(source.getResultCommand()));

        if(source.getUserId()!=null){
            AppUsers receptionist=new AppUsers();
            receptionist.setId(source.getUserId());
            collectionLog.setAppUsers(receptionist);
            AppUsers user = receptionist.addResultCollectionLog(collectionLog);
        }


        return collectionLog;
    }
}
