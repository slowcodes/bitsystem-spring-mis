package ng.com.bitsystems.mis.api.patients;

import ng.com.bitsystems.mis.command.patients.PatientCommand;
import ng.com.bitsystems.mis.converters.patient.PatientCommandToPatient;
import ng.com.bitsystems.mis.converters.patient.PatientToPatientCommand;
import ng.com.bitsystems.mis.services.patients.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/patients")
public class Patients {

    private PatientCommandToPatient patientCommandToPatient;
    private PatientToPatientCommand patientToPatientCommand;
    private PatientService patientService;

    public Patients(PatientCommandToPatient patientCommandToPatient,
                    PatientToPatientCommand patientToPatientCommand,
                    PatientService patientService) {
        this.patientCommandToPatient = patientCommandToPatient;
        this.patientToPatientCommand = patientToPatientCommand;
        this.patientService = patientService;
    }

    @GetMapping("/")
    List<PatientCommand> allPatients(){
        List<PatientCommand> patients =
        patientService.findAll()
                .stream()
                .map(s -> (patientToPatientCommand.convert(s))).collect(Collectors.toList());
        return (patients);
    }

    @GetMapping ("/{id}")
    PatientCommand getPatient(@PathVariable(value = "id") Long patientId ){
        return patientToPatientCommand.convert(patientService.findByID(patientId));
    }

    @PostMapping("/add")
    PatientCommand updatePatient(@RequestBody PatientCommand patientCommand){
        return patientToPatientCommand.convert(patientService.add(patientCommandToPatient.convert(patientCommand)));
    }
}
