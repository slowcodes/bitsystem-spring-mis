package ng.com.bitsystems.mis.command.consultation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SymptomsDirectoryCommand {
    private Long id;
    private String symptoms;
}
