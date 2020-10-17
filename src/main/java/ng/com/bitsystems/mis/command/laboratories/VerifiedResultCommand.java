package ng.com.bitsystems.mis.command.laboratories;

import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;

import java.util.Date;

public class VerifiedResultCommand {
    private Long id;
    private ResultCommand resultCommand;
    private Long userId;
    private Date timeOfVerification;
    private ResultCollectionLog resultCollectionLog;
}
