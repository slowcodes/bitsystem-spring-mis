package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationRegistryCommand;
import ng.com.bitsystems.mis.converters.patient.PatientCommandToPatient;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonorRegistry;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DonorRegistryCommandToDonorRegistry implements Converter<DonationRegistryCommand, DonorRegistry> {
    private DonationCommandToDonation donationCommandToDonation;
    private PatientCommandToPatient patientCommandToPatient;

    public DonorRegistryCommandToDonorRegistry(DonationCommandToDonation donationCommandToDonation,
                                               PatientCommandToPatient patientCommandToPatient) {
        this.donationCommandToDonation = donationCommandToDonation;
        this.patientCommandToPatient = patientCommandToPatient;
    }

    @Override
    public DonorRegistry convert(DonationRegistryCommand source) {

        if(source==null){
            return null;
        }
        final DonorRegistry donorRegistry=new DonorRegistry();
        donorRegistry.setId(source.getId());
        donorRegistry.setBloodGroup(source.getBloodGroup());
        if(source.getDonationCommands().size()>0 && source.getDonationCommands()!=null){
            source.getDonationCommands().forEach(donationCommand -> donorRegistry.getDonations().add(donationCommandToDonation.convert(donationCommand)));
        }

        donorRegistry.setPatients(patientCommandToPatient.convert(source.getPatient()));

        return donorRegistry;
    }
}
