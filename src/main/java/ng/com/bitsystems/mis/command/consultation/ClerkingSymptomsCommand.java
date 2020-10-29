package ng.com.bitsystems.mis.command.consultation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class ClerkingSymptomsCommand {
    private Long id;
    private SymptomsDirectoryCommand symptomsDirectoryCommand;
    private Integer degree;
    private Long clerkingId;
}
