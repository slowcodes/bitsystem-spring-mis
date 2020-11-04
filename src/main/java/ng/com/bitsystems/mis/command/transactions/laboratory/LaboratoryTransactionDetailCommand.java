package ng.com.bitsystems.mis.command.transactions.laboratory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;
import ng.com.bitsystems.mis.command.laboratories.ExperimentReadingCommand;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor

public class LaboratoryTransactionDetailCommand {
    private Long id;
    private Long laboratoryInvestigationId;
    private Long laboratoryTransactionId;
    private ServicePriceCodeCommand servicePriceCodeCommand;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private String comment;
    private Date timeOfTransaction;
    private LocalDate dateOfTransaction;
    private Integer reversal;
    private Long packageId;
    private Set<ExperimentReadingCommand> experimentReadingCommands = new HashSet<>();

}
