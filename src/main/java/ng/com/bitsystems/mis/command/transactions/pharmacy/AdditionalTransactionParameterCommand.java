package ng.com.bitsystems.mis.command.transactions.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class AdditionalTransactionParameterCommand {
    private Long id;
    private String parameter;
    private String description;
    private String dataType;
    private Set<AdditionalTransactionDetailCommand> additionalTransactionDetailCommand = new HashSet<>();
}
