package ng.com.bitsystems.mis.command.consultation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class DiseaseDirectoryCommand {
    private Long id;
    private Long createdBy;
    private String disease;
    private String description;
}
