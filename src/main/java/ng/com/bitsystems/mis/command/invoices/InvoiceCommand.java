package ng.com.bitsystems.mis.command.invoices;

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
public class InvoiceCommand {
    private Long id;
    private Long patientId;
    private long usersId;
    private LocalDate dateTransaction;
    private LocalDateTime timeOfTransaction;
    private String comment;
    private Integer discount;
    private Long referralId;
    private String status;
    private Set<LaboratoryInvoiceDetailCommand> laboratoryInvoiceDetailCommands = new HashSet<>();
    private Set<OtherServiceInvoiceDetailCommand> otherServiceInvoiceDetailCommands = new HashSet<>();
    private Set<PharmacyInvoiceDetailCommand> pharmacyInvoiceDetailCommands = new HashSet<>();
}
