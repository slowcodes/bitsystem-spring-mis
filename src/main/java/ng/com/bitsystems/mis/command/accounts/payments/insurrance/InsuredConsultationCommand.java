package ng.com.bitsystems.mis.command.accounts.payments.insurrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.consultation.ClerksCommand;

@Setter
@Getter
@NoArgsConstructor
public class InsuredConsultationCommand {
    private Long id;
    private Long programsId;
    private Double percentageIncurred;
    private ClerksCommand consultation;
}
