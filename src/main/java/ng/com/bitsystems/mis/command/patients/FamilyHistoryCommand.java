package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.consultation.DiseaseDirectoryCommand;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class FamilyHistoryCommand {
    private Long id;
    private Set<DiseaseDirectoryCommand> diseaseDirectory = new HashSet<>();
    private Long familyFolderId;
    private Long userId;
    private LocalDate dateRecorded;
}
