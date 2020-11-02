package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.consultation.DiseaseDirectoryCommand;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class FamilyHistoryCommand {
    private Long id;
    private DiseaseDirectoryCommand diseaseDirectory;
    private String note;
    private Long familyFolderId;
    private Long userId;
    private LocalDate dateRecorded;
}
