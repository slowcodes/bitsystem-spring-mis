package ng.com.bitsystems.mis.api.laboratory;

import ng.com.bitsystems.mis.command.laboratories.CollectedSamplesCommand;
import ng.com.bitsystems.mis.converters.laboratory.CollectedSampleCommandToCollectedSample;
import ng.com.bitsystems.mis.converters.laboratory.CollectedSamplesToCollectedSampleCommand;
import ng.com.bitsystems.mis.services.laboratories.CollectedSamplesServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/laboratory/sample-collection")
public class SampleCollection {

    private CollectedSamplesServices collectedSamplesServices;
    private CollectedSampleCommandToCollectedSample collectedSampleCommandToCollectedSample;
    private CollectedSamplesToCollectedSampleCommand collectedSamplesToCollectedSampleCommand;

    public SampleCollection(CollectedSamplesServices collectedSamplesServices, CollectedSampleCommandToCollectedSample collectedSampleCommandToCollectedSample, CollectedSamplesToCollectedSampleCommand collectedSamplesToCollectedSampleCommand) {
        this.collectedSamplesServices = collectedSamplesServices;
        this.collectedSampleCommandToCollectedSample = collectedSampleCommandToCollectedSample;
        this.collectedSamplesToCollectedSampleCommand = collectedSamplesToCollectedSampleCommand;
    }

    @GetMapping("/")
    List<CollectedSamplesCommand> allSamples(){
        return  collectedSamplesServices
                .findAll()
                .stream()
                .map(collectedSamples -> collectedSamplesToCollectedSampleCommand.convert(collectedSamples))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    CollectedSamplesCommand getSample(@PathVariable(value = "id") Long id){
        return collectedSamplesToCollectedSampleCommand.convert(collectedSamplesServices.findByID(id));
    }

    @PostMapping("/add")
    CollectedSamplesCommand addSample(@RequestBody CollectedSamplesCommand collectedSamplesCommand){
        return collectedSamplesToCollectedSampleCommand.convert(
                collectedSamplesServices.add(collectedSampleCommandToCollectedSample.convert(collectedSamplesCommand))
        );
    }

}
