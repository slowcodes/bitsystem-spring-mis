package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class ResultCommand {
    private Long id;
    private Long userId;
    private String footNote;
    private Date logTime;
    private String resultNote;
    private String commentColor;
    private String signatoryColor;
    private Long verifiedResultId;
    private Set<ExperimentReadingCommand> experimentReadingCommands= new HashSet<>();
}
