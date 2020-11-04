package ng.com.bitsystems.mis.command.rewards.promo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PromoProductCommand {
    private Long id;
    private Long pharmacyProductId;
    private Long userId;
    private Integer status;
    private String title;
    private String description;
    private LocalDate dateCreated;
    private LocalDate startDay;
    private LocalDate endDay;
    private Integer qty;
    private Integer productPromoExclusivity;
    private Set<PromoProductReceivedLogsCommand> promoProductReceivedLogsCommands = new HashSet<>();

}
