package ng.com.bitsystems.mis.command.transactions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Setter
@Getter
@NoArgsConstructor
public class TransactionCommand {
    private Long id;
    private Long userId;
    private LocalDate dateTransaction;
    private LocalDateTime timeOfTransaction;
    private String comment;
    private Integer discount;
}
