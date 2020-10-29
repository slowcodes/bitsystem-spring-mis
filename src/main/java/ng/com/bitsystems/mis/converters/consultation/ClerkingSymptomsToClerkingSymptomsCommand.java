package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.ClerkingSymptomsCommand;
import ng.com.bitsystems.mis.models.consultation.ClerkingSymptoms;
import org.springframework.core.convert.converter.Converter;

public class ClerkingSymptomsToClerkingSymptomsCommand implements Converter<ClerkingSymptoms, ClerkingSymptomsCommand> {
    private SymptomsDirectoryToSymtomsDirectoryCommand symptomsDirectoryToSymtomsDirectoryCommand;

    public ClerkingSymptomsToClerkingSymptomsCommand(SymptomsDirectoryToSymtomsDirectoryCommand symptomsDirectoryToSymtomsDirectoryCommand) {
        this.symptomsDirectoryToSymtomsDirectoryCommand = symptomsDirectoryToSymtomsDirectoryCommand;
    }

    @Override
    public ClerkingSymptomsCommand convert(ClerkingSymptoms source) {

        if(source==null){
            return null;
        }

        final ClerkingSymptomsCommand symptomsCommand = new ClerkingSymptomsCommand();
        symptomsCommand.setId(source.getId());
        if(source.getClerks()!=null){
            symptomsCommand.setClerkingId(source.getClerks().getId());
        }
        symptomsCommand.setDegree(source.getDegree());
        symptomsCommand.setSymptomsDirectoryCommand(symptomsDirectoryToSymtomsDirectoryCommand.convert(source.getSymptomsDirectory()));
        return symptomsCommand;
    }
}
