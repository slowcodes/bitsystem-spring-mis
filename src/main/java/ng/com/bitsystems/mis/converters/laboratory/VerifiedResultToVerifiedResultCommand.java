package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.VerifiedResultCommand;
import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import org.springframework.core.convert.converter.Converter;

public class VerifiedResultToVerifiedResultCommand
implements Converter<VerifiedResults, VerifiedResultCommand> {
    private ResultToResultCommand resultToResultCommand;
    private ResultCollectionToResultCollectionCommand resultCollectionToResultCollectionCommand;

    @Override
    public VerifiedResultCommand convert(VerifiedResults source) {
        if(source==null){
            return null;
        }
        final VerifiedResultCommand verifiedResultCommand=new VerifiedResultCommand();

        verifiedResultCommand.setId(source.getId());
        verifiedResultCommand.setResultCollectionLog(resultCollectionToResultCollectionCommand.convert(source.getResultCollectionLog()));
        verifiedResultCommand.setResultCommand(resultToResultCommand.convert(source.getResults()));
        verifiedResultCommand.setTimeOfVerification(source.getTimeOfVerfication());

        if(source.getUsers()!=null)
            verifiedResultCommand.setUserId(source.getUsers().getId());

        return verifiedResultCommand;
    }
}
