package ng.com.bitsystems.mis.command.accounts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class ExpenseManagerCommand {
    private Long id;
    private Long usersByIssueTo;
    private Long usersByTeller;
    private LocalDate expenseDate;
    private double amount;
    private String purpose;
    private Long expenseBookId;
}
