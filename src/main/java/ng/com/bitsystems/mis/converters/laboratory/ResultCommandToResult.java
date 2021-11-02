package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ResultCommand;
import ng.com.bitsystems.mis.models.laboratories.Results;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ResultCommandToResult implements Converter<ResultCommand, Results> {
    private ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading;

    public ResultCommandToResult(ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading) {
        this.experimentReadingCommandToExperimentReading = experimentReadingCommandToExperimentReading;
    }

    @Override
    public Results convert(ResultCommand source) {
        if(source==null){
            return null;
        }

        final Results results=new Results();

        results.setCommentColor(source.getCommentColor());
        results.setFootNote(source.getFootNote());
        results.setDateTransaction(source.getLogTime());
        results.setSignatoryColor(source.getSignatoryColor());

        if(source.getUserId()!=null){
            AppUsers scientists=new AppUsers();
            scientists.setId(source.getUserId());
            //results.setAppUsers(scientists);
            AppUsers user = scientists.addCreatedResults(results);
        }

        results.setResultNote(source.getResultNote());
        results.setCommentColor(source.getCommentColor());
        results.setId(source.getId());

        if(source.getExperimentReadingCommands().size()>0 && source.getExperimentReadingCommands()!=null)
            source.getExperimentReadingCommands().forEach(experimentReadingCommand ->
                    results.getExperimentReadings().add(
                            experimentReadingCommandToExperimentReading.convert(
                                    experimentReadingCommand
                            )
                    ));

        return results;
    }
}
