package ng.com.bitsystems.mis.command.consultation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class InternalOrganReviewCommand {
    private Long id;
    private InternalOrgansDirectoryCommand internalOrgansDirectoryCommand;
    private Integer state; //0-10, 10-Perfect condition, 0 very bad condition
    private String review;
    private Long clerksId;
    private SymptomsDirectoryCommand symptomsDirectoryCommand;
}
