package ng.com.bitsystems.mis.command.transactions.laboratory;

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
public class LaboratoryTransactionCommand {
    private Long id;
    private Long patientId;
    private Long userId;
    private LocalDate dateTransaction;
    private LocalDateTime timeOfTransaction;
    private String comment;
    private Integer discount;
    private String presentingComplaint;
    private String provisionalDiagnosis;
    private Set<LaboratoryTransactionDetailCommand> laboratoryTransactionDetailCommands = new HashSet<>();
    private Long referralId;
}
