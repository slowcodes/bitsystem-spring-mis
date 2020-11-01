package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.VerifiedResultCommand;
import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import ng.com.bitsystems.mis.models.users.Scientists;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class VerifiedResultCommandToVerifiedResult implements Converter<VerifiedResultCommand, VerifiedResults> {
    private ResultCommandToResult resultCommandToResult;
    private ResultCollectionCommandToResultCollection resultCollectionCommandToResultCollection;

    public VerifiedResultCommandToVerifiedResult(ResultCommandToResult resultCommandToResult,
                                                 ResultCollectionCommandToResultCollection resultCollectionCommandToResultCollection) {
        this.resultCommandToResult = resultCommandToResult;
        this.resultCollectionCommandToResultCollection = resultCollectionCommandToResultCollection;
    }

    @Nullable
    @Override
    public VerifiedResults convert(VerifiedResultCommand source) {

        if(source==null)
            return null;

        final VerifiedResults verifiedResults=new VerifiedResults();
        verifiedResults.setResults(resultCommandToResult.convert(source.getResultCommand()));
        verifiedResults.setResultCollectionLog(resultCollectionCommandToResultCollection.convert(source.getResultCollectionLog()));
        verifiedResults.setTimeOfVerfication(source.getTimeOfVerification());

        if(source.getUserId()!=null){
            Scientists scientists=new Scientists();
            scientists.setId(source.getUserId());
            verifiedResults.setUsers(scientists);
            Scientists user = scientists.addVerifiedResult(verifiedResults);
        }
        verifiedResults.setId(source.getId());

        return verifiedResults;
    }
}
