package ng.com.bitsystems.mis.command.rewards.promo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class VolumeBasedPromosCommand {
    private Long id;
    private Long userId;
    private String title;
    private String description;
    private Date dateCreated;
    private Integer discount;
    private Date startDay;
    private Date endDay;
    private Double minTxnTotal;
    private Integer exclusivity;
}
