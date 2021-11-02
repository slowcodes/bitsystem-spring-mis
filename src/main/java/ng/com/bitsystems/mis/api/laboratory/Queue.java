package ng.com.bitsystems.mis.api.laboratory;

import ng.com.bitsystems.mis.command.laboratories.QueueCommand;
import ng.com.bitsystems.mis.converters.laboratory.QueueCommandToQueue;
import ng.com.bitsystems.mis.converters.laboratory.QueueToQueueCommand;
import ng.com.bitsystems.mis.services.laboratories.QueueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/laboratory/queue")
public class Queue {
    private QueueToQueueCommand queueToQueueCommand;
    private QueueCommandToQueue queueCommandToQueue;
    private QueueService queueService;

    public Queue(QueueToQueueCommand queueToQueueCommand,
                 QueueCommandToQueue queueCommandToQueue,
                 QueueService queueService) {
        this.queueToQueueCommand = queueToQueueCommand;
        this.queueCommandToQueue = queueCommandToQueue;
        this.queueService = queueService;
    }

    @GetMapping("/")
    List<QueueCommand> allSamples(){
        return queueService.findAll()
                .stream()
                .map(sampleCollectionQueue -> (queueToQueueCommand.convert(sampleCollectionQueue)))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    QueueCommand getASample(@PathVariable(value = "id") Long sampleId){
        return queueToQueueCommand.convert(queueService.findByID(sampleId));
    }

    @PostMapping("/add")
    QueueCommand add(@RequestBody QueueCommand queueCommand){
        return queueToQueueCommand.convert(queueService.add(
                queueCommandToQueue.convert(queueCommand)
        ));
    }

    @GetMapping("/sample-collection-by-transaction-details")
    QueueCommand getASampleByTDId(@PathVariable(value = "id") Long sampleId){
        return queueToQueueCommand.convert(
                queueService.findAll()
                .stream()
                        .filter(sampleCollectionQueue -> sampleCollectionQueue.getId()==sampleId) //This implementation is wrong. Remove commment after correction
                .findAny()
                        .get());
    }

//    @PostMapping("/update-status")
//    QueueCommand updateStatus(@RequestBody QueueCommand sampleCollectionQueueCommand){
//
//    }
}
