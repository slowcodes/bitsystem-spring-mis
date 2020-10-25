package ng.com.bitsystems.mis.command.accounts.payments.insurrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.consultation.BookConsultationCommand;

@Setter
@Getter
@NoArgsConstructor
public class InsuredConsultationCommand {
    private Long id;
    private ProgramsCommand programsCommand;
    private Double percentageIncurred;
    private BookConsultationCommand bookConsultationCommand;
}
