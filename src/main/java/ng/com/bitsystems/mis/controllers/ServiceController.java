package ng.com.bitsystems.mis.controllers;

import ng.com.bitsystems.mis.services.consultations.DiseaseDirectoryService;
import ng.com.bitsystems.mis.services.consultations.SymptomsDirectoryService;
import ng.com.bitsystems.mis.services.laboratories.InvestigationGroupService;
import ng.com.bitsystems.mis.services.laboratories.PackageService;
import ng.com.bitsystems.mis.services.referrals.ReferralService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController {

    private InvestigationGroupService investigationGroupService;
    private ReferralService referralService;
    private PackageService packageService;
    private DiseaseDirectoryService diseaseDirectoryService;
    private SymptomsDirectoryService symptomsDirectoryService;

    public ServiceController(InvestigationGroupService investigationGroupService, ReferralService referralService, PackageService packageService, DiseaseDirectoryService diseaseDirectoryService, SymptomsDirectoryService symptomsDirectoryService) {
        this.investigationGroupService = investigationGroupService;
        this.referralService = referralService;
        this.packageService = packageService;
        this.diseaseDirectoryService = diseaseDirectoryService;
        this.symptomsDirectoryService = symptomsDirectoryService;
    }

    @RequestMapping("/laboratory/results/pending_results")
    public String pendingLabResults(){
        return "";
    }

    @RequestMapping("/services/book/{patientId}")
    public String services(Model model, @PathVariable int patientId){
        model.addAttribute("patientId", patientId);
        return "custom/profile/overview-3";
    }

    @RequestMapping("/services/book/{patientId}/laboratory")
    public String labResults(Model model, @PathVariable int patientId){
        model.addAttribute("patientId", patientId);
        model.addAttribute("lab_packages", packageService.findAll());
        model.addAttribute("investigationGroups", investigationGroupService.findAll());
        model.addAttribute("referrals", referralService.findAll());
        model.addAttribute("symptomsDirectory", symptomsDirectoryService.findAll());
        model.addAttribute("diseasesDirectory", diseaseDirectoryService.findAll());
        return "components/forms/widgets/select2";
    }

    @RequestMapping("/laboratory/results/collected_results")
    public String collectedResults(){
        return "collectedResults.html";
    }

    @RequestMapping("/laboratory/results/prepared_results")
    public String preparedLabResults(){
        return "prepareLabResult.html";
    }

    @RequestMapping("/laboratory/results/verified_results")
    public String verifiedResults(){
        return "verifiedResult.html";
    }

    @RequestMapping("/laboratory/results/archive")
    public String labArchive(){

        return "archive.html";
    }

    @RequestMapping("Experiments")
    public String experiments(){
        return "experiments.html";
    }

    @RequestMapping("/laboratory/experiments/investigation/sample_collection")
    public String sampleCollection(){

        return "sampleCollection.html";
    }

    @RequestMapping("/laboratory/experiments/investigation/samples")
    public String samples(){

        return "samples.html";
    }

    @RequestMapping("/laboratory/experiments/investigation/results/prepare")
    public String prepareResults(){

        return "prepareResult.html";
    }

    @RequestMapping("/laboratory/experiments/investigation/services/manage")
    public String manageLabServices(){

        return "manageLabServices.html";
    }

    @RequestMapping("/laboratory/experiments/parameters")
    public String experimentParameters(){

        return "experimentParameters.html";
    }

    @RequestMapping("/laboratory/experiments/readings/")
    public String experimentReadings(){

        return "experimentsReading.html";
    }

    @RequestMapping("/laboratory/experiments/console")
    public String experimentConsole(){

        return "experimentConsole.html";
    }

    @RequestMapping("Observations")
    public String labObservations(){

        return "labObservation.html";
    }

    @RequestMapping("/laboratory/observation/queue")
    public String observationQueue(){

        return "observationQueue.html";
    }

    @RequestMapping("/laboratory/observation/results/prepare")
    public String prepareObservationResult(){

        return "prepareObservationResult.html";
    }

    @RequestMapping("/laboratory/observations/services/manage")
    public String manageLabObservations(){

        return "manageLabObservations.html";
    }

    @RequestMapping("/laboratory/observation/console")
    public String observationConsole(){

        return "observationConsole.html";
    }

//

    @RequestMapping("/laboratory/blood-bank/registry")
    public String donorRegistry(){

        return "donorRegistry.html";
    }
    @RequestMapping("/laboratory/blood-bank/issue")
    public String issueBlood(){

        return "issueBlood.html";
    }

    @RequestMapping("/laboratory/donation/screening")
    public String donorScrening(){

        return "donorScreening.html";
    }

    @RequestMapping("/laboratory/blood-bank/screening")
    public String donorScreeningResult(){

        return "donorScreeningResults.html";
    }

    @RequestMapping("/laboratory/blood-bank/screening/results")
    public String bloodBankScreeningResult(){

        return "bloodBankScreeningResult.html";
    }

    @RequestMapping("/laboratory/blood-bank/bleeding/logging")
    public String logBleeding(){

        return "logBleeding.html";
    }

    @RequestMapping("/laboratory/bloodbank")
    public String bloodBank(){

        return "bloodbank.html";
    }

    @RequestMapping("/laboratory/laboratories")
    public String labs(){

        return "laboratories.html";
    }

    @RequestMapping("/laboratories/add")
    public String addLab(){

        return "addLab.html";
    }

    @RequestMapping("/laboratories/update")
    public String updateLab(){

        return "updateLab.html";
    }

    @RequestMapping("/laboratories/packages")
    public String labPackages(){

        return "labPackages.html";
    }

    @RequestMapping("/laboratories/packages/add")
    public String addLabPackages(){

        return "addLabPackages.html";
    }

    @RequestMapping("/laboratories/packages/update")
    public String updateLabPackages(){

        return "updateLabPackages.html";
    }
}
