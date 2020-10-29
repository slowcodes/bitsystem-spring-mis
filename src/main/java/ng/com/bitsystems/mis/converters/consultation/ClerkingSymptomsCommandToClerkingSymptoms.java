package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.ClerkingSymptomsCommand;
import ng.com.bitsystems.mis.models.consultation.ClerkingSymptoms;
import ng.com.bitsystems.mis.models.consultation.Clerks;
import org.springframework.core.convert.converter.Converter;

public class ClerkingSymptomsCommandToClerkingSymptoms implements Converter<ClerkingSymptomsCommand, ClerkingSymptoms> {
    private SymptomsDirectoryCommandToSymptomsDirectory symptomsDirectoryCommandToSymptomsDirectory;

    public ClerkingSymptomsCommandToClerkingSymptoms(SymptomsDirectoryCommandToSymptomsDirectory symptomsDirectoryCommandToSymptomsDirectory) {
        this.symptomsDirectoryCommandToSymptomsDirectory = symptomsDirectoryCommandToSymptomsDirectory;
    }

    @Override
    public ClerkingSymptoms convert(ClerkingSymptomsCommand source) {
        if(source==null){
            return null;
        }
        ClerkingSymptoms clerkingSymptoms= new ClerkingSymptoms();
        clerkingSymptoms.setId(source.getClerkingId());
        clerkingSymptoms.setDegree(source.getDegree());
        if(source.getClerkingId()!=null){
            Clerks clerks = new Clerks();
            clerks.setId(source.getClerkingId());
            clerkingSymptoms.setClerks(clerks);
            Clerks clerk = clerks.addClerkingSymptoms(clerkingSymptoms);
        }
        clerkingSymptoms.setSymptomsDirectory(symptomsDirectoryCommandToSymptomsDirectory.convert(source.getSymptomsDirectoryCommand()));
        return clerkingSymptoms;
    }
}
