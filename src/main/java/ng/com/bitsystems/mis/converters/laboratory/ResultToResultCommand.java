package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ResultCommand;
import ng.com.bitsystems.mis.models.laboratories.Results;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ResultToResultCommand implements Converter<Results, ResultCommand> {
    private ExperimentReadingsToExperimentReadingCommand experimentReadingsToExperimentReadingCommand;

    public ResultToResultCommand(ExperimentReadingsToExperimentReadingCommand experimentReadingsToExperimentReadingCommand) {
        this.experimentReadingsToExperimentReadingCommand = experimentReadingsToExperimentReadingCommand;
    }

    @Nullable
    @Override
    public ResultCommand convert(Results source) {

        if(source==null){
            return null;
        }
        ResultCommand resultCommand=new ResultCommand();

        resultCommand.setId(source.getId());
        resultCommand.setCommentColor(source.getCommentColor());
        resultCommand.setFootNote(source.getFootNote());
        resultCommand.setLogTime(source.getDateTransaction());
        resultCommand.setSignatoryColor(source.getSignatoryColor());

        if(source.getAppUsers()!=null){
            resultCommand.setUserId(source.getAppUsers().getId());
        }

        if(source.getExperimentReadings().size()>0 && source.getExperimentReadings()!=null)
            source.getExperimentReadings().forEach(experimentReadings ->
                    resultCommand.getExperimentReadingCommands().add(
                            experimentReadingsToExperimentReadingCommand.convert(experimentReadings)
                    ));

        resultCommand.setResultNote(source.getResultNote());

        return resultCommand;
    }
}
