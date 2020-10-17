package ng.com.bitsystems.mis.command.invoices;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class PharmacyInvoiceDetailCommand {
    private Long id;
    private Long patientId;
    private Long userId;
    private LocalDate dateTransaction;
    private LocalDateTime timeOfTransaction;
    private String comment;
    private Integer discount;
    private Long referralId;
}
