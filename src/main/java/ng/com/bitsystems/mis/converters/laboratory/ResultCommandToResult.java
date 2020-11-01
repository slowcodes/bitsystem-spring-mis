package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ResultCommand;
import ng.com.bitsystems.mis.models.laboratories.Results;
import ng.com.bitsystems.mis.models.users.Scientists;
import org.springframework.core.convert.converter.Converter;

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
        results.setLogTime(source.getLogTime());
        results.setSignatoryColor(source.getSignatoryColor());

        if(source.getUserId()!=null){
            Scientists scientists=new Scientists();
            scientists.setId(source.getUserId());
            results.setUsers(scientists);
            Scientists user = scientists.addCreatedResults(results);
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
