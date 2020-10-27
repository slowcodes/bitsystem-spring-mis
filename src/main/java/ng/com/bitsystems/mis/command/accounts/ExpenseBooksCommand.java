package ng.com.bitsystems.mis.command.accounts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class ExpenseBooksCommand {
    private Long id;
    private String description;
    private Long parentBookId;
    private Set<ExpenseManagerCommand> expenseManagerCommands = new HashSet<>();
    private Long createdById;
}
