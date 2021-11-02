package ng.com.bitsystems.mis.api.laboratory;

import ng.com.bitsystems.mis.command.laboratories.ExperimentParametersCommand;
import ng.com.bitsystems.mis.command.laboratories.ExperimentReadingCommand;
import ng.com.bitsystems.mis.converters.laboratory.ExperimentParameterCommandToExperimentParameter;
import ng.com.bitsystems.mis.converters.laboratory.ExperimentParameterToExperimentParameterCommand;
import ng.com.bitsystems.mis.converters.laboratory.ExperimentReadingCommandToExperimentReading;
import ng.com.bitsystems.mis.converters.laboratory.ExperimentReadingsToExperimentReadingCommand;
import ng.com.bitsystems.mis.services.laboratories.ExperimentParametersService;
import ng.com.bitsystems.mis.services.laboratories.ExperimentReadingService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/laboratory/experiments")
public class Experiments {

    private ExperimentParametersService experimentParametersService;
    private ExperimentParameterCommandToExperimentParameter experimentParameterCommandToExperimentParameter;
    private ExperimentParameterToExperimentParameterCommand experimentParameterToExperimentParameterCommand;
    private ExperimentReadingService experimentReadingService;
    private ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading;
    private ExperimentReadingsToExperimentReadingCommand experimentReadingsToExperimentReadingCommand;

    public Experiments(ExperimentParametersService experimentParametersService, ExperimentParameterCommandToExperimentParameter experimentParameterCommandToExperimentParameter, ExperimentParameterToExperimentParameterCommand experimentParameterToExperimentParameterCommand, ExperimentReadingService experimentReadingService, ExperimentReadingCommandToExperimentReading experimentReadingCommandToExperimentReading, ExperimentReadingsToExperimentReadingCommand experimentReadingsToExperimentReadingCommand) {
        this.experimentParametersService = experimentParametersService;
        this.experimentParameterCommandToExperimentParameter = experimentParameterCommandToExperimentParameter;
        this.experimentParameterToExperimentParameterCommand = experimentParameterToExperimentParameterCommand;
        this.experimentReadingService = experimentReadingService;
        this.experimentReadingCommandToExperimentReading = experimentReadingCommandToExperimentReading;
        this.experimentReadingsToExperimentReadingCommand = experimentReadingsToExperimentReadingCommand;
    }

    @GetMapping("/parameters/")
    List<ExperimentParametersCommand> all(){
        List<ExperimentParametersCommand> commands = new ArrayList<>();
        experimentParametersService.findAll().stream().map(experimentParameters -> commands.add(experimentParameterToExperimentParameterCommand.convert(experimentParameters)));
        return commands;
    }

    @GetMapping("/parameters/investigation/{id}")
    List<ExperimentParametersCommand> allbyLabId(@PathVariable(value = "id") Long invId){
        List<ExperimentParametersCommand> commands = experimentParametersService.findAll().stream()
                .filter(experimentParameters -> experimentParameters.getInvestigations().getId()==invId)
                .map(experimentParameters -> (experimentParameterToExperimentParameterCommand.convert(experimentParameters)))
                .collect(Collectors.toList());
        return commands;
    }

    @PostMapping("/parameters/add")
    ExperimentParametersCommand addParameter(@RequestBody ExperimentParametersCommand experimentParametersCommand){
        return experimentParameterToExperimentParameterCommand.convert(experimentParametersService.add(
                experimentParameterCommandToExperimentParameter.convert(experimentParametersCommand)
        ));
    }

    @GetMapping("/readings/")
    List<ExperimentReadingCommand> allReadings(){
        return  experimentReadingService.findAll()
                .stream()
                .map(experimentReadings -> experimentReadingsToExperimentReadingCommand.convert(experimentReadings))
                .collect(Collectors.toList());
    }

    @PostMapping("/readings/add")
    ExperimentReadingCommand addReading(@RequestBody ExperimentReadingCommand experimentReadingCommand){
        return experimentReadingsToExperimentReadingCommand.convert(
                experimentReadingService.add(
                        experimentReadingCommandToExperimentReading.convert(experimentReadingCommand)
                )
        );
    }

    @GetMapping("/{id}")
    ExperimentReadingCommand getReading(@PathVariable(value = "id") Long id){
        return experimentReadingsToExperimentReadingCommand.convert(experimentReadingService.findByID(id));
    }
}

