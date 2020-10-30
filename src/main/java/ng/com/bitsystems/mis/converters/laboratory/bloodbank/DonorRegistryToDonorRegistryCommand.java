package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationRegistryCommand;
import ng.com.bitsystems.mis.converters.patient.PatientToPatientCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonorRegistry;
import org.springframework.core.convert.converter.Converter;

public class DonorRegistryToDonorRegistryCommand implements Converter<DonorRegistry, DonationRegistryCommand> {
    private PatientToPatientCommand patientToPatientCommand;
    private DonationToDonationCommand donationToDonationCommand;

    @Override
    public DonationRegistryCommand convert(DonorRegistry source) {
        if(source==null){
            return null;
        }
        DonationRegistryCommand donationRegistryCommand= new DonationRegistryCommand();
        donationRegistryCommand.setId(source.getId());

        if(source.getPatients()!=null)
            donationRegistryCommand.setPatient(patientToPatientCommand.convert(source.getPatients()));

        if(source.getDonations().size()>0 && source.getDonations() !=null)
            source.getDonations().forEach(donations -> donationRegistryCommand.getDonationCommands().add(donationToDonationCommand.convert(donations)));

        return donationRegistryCommand;
    }
}
