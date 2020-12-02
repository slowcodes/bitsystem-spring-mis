package ng.com.bitsystems.mis.command.rewards.promo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class VolumeBasedPromosCommand {
    private Long id;
    private Long userId;
    private String title;
    private String description;
    private LocalDate dateCreated;
    private Integer discount;
    private LocalDate startDay;
    private LocalDate endDay;
    private Double minTxnTotal;
    private Integer exclusivity;
}
