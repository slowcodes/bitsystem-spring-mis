package ng.com.bitsystems.mis.command.consultation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.consultation.ClerkingSymptoms;

@Setter
@Getter
@NoArgsConstructor
public class InternalOrganReviewCommand {
    private InternalOrgansDirectoryCommand internalOrgansDirectoryCommand;
    private Integer state; //0-10, 10-Perfect condition, 0 very bad condition
    private String review;
    private ClerkingSymptoms clerkingSymptoms;
}
