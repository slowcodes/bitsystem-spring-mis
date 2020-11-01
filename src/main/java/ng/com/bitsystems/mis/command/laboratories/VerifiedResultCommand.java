package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class VerifiedResultCommand {
    private Long id;
    private ResultCommand resultCommand;
    private Long userId;
    private Date timeOfVerification;
    private ResultCollectionCommand resultCollectionLog;
}
