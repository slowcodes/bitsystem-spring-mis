package ng.com.bitsystems.mis.command.transactions.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PharmacySalesTransactionCommand {
    private Long id;
    private Long patientId;
    private Long userId;
    private LocalDate dateTransaction;
    private LocalDateTime timeOfTransaction;
    private String comment;
    private Integer discount;
    private Set<PharmacySalesTransactionDetailCommand> pharmacySalesTransactionDetailCommands = new HashSet<>();
    private Long referralId;
}
