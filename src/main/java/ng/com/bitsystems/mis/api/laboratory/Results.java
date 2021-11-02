package ng.com.bitsystems.mis.api.laboratory;


import ng.com.bitsystems.mis.command.laboratories.ResultCommand;
import ng.com.bitsystems.mis.converters.laboratory.ResultCommandToResult;
import ng.com.bitsystems.mis.converters.laboratory.ResultToResultCommand;
import ng.com.bitsystems.mis.services.laboratories.ResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/laboratory/results/")
public class Results {

    private ResultToResultCommand resultToResultCommand;
    private ResultCommandToResult resultCommandToResult;
    private ResultService resultService;

    public Results(ResultToResultCommand resultToResultCommand, ResultCommandToResult resultCommandToResult, ResultService resultService) {
        this.resultToResultCommand = resultToResultCommand;
        this.resultCommandToResult = resultCommandToResult;
        this.resultService = resultService;
    }

    @GetMapping("/")
    List<ResultCommand> getAllresults(){
        return resultService.findAll()
                .stream()
                .map(results -> resultToResultCommand.convert(results))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    ResultCommand getResult(@PathVariable (value = "id")Long id){
        return resultToResultCommand.convert(resultService.findByID(id));
    }

    @PostMapping("/add")
    ResultCommand addResult(@RequestBody ResultCommand resultCommand){
        return resultToResultCommand.convert(resultService.add(resultCommandToResult.convert(resultCommand)));
    }
}

