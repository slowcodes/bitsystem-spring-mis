package ng.com.bitsystems.mis.api.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.models.laboratories.InvestigationGroups;
import ng.com.bitsystems.mis.services.laboratories.InvestigationGroupService;
import ng.com.bitsystems.mis.services.laboratories.LaboratoryInvestigationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/laboratory/investigations/")
public class Investigations {

    private LaboratoryInvestigationService laboratoryInvestigationService;
    private InvestigationGroupService investigationGroupService;

    public Investigations(LaboratoryInvestigationService laboratoryInvestigationService,
                          InvestigationGroupService investigationGroupService) {
        this.laboratoryInvestigationService = laboratoryInvestigationService;
        this.investigationGroupService = investigationGroupService;
    }

    @PostMapping("/add")
    ng.com.bitsystems.mis.models.laboratories.Investigations addInvestigations(@RequestBody LaboratoryInvestigationCommand investigations){
        return laboratoryInvestigationService.add(investigations);
    }

    @GetMapping("/groups")
    //public List<InvestigationGroups> getInvestigationGroups(){
    public ResponseEntity<List<InvestigationGroups>> getInvestigationGroups(){
        //return new ArrayList<>(investigationGroupService.findAll());
        return new ResponseEntity<>(new ArrayList<>(investigationGroupService.findAll()), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<ng.com.bitsystems.mis.models.laboratories.Investigations> getInvestigation(@PathVariable(value = "id") Long id){
        ng.com.bitsystems.mis.models.laboratories.Investigations investigation = laboratoryInvestigationService.findByID(id);
        return ResponseEntity.ok(investigation);
    }
}
