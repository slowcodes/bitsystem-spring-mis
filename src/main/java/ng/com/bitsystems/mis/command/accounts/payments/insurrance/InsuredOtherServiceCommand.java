package ng.com.bitsystems.mis.command.accounts.payments.insurrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;

@Setter
@Getter
@NoArgsConstructor
public class InsuredOtherServiceCommand {
    private Long id;
    private ProgramsCommand programsCommand;
    private Double percentageIncurred;
    private OtherServiceCommand otherServiceCommand;
}
