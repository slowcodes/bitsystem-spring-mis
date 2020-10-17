package ng.com.bitsystems.mis.command.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RetailMeasureCommand {
    private Long id;
    private String metric;
    private String mesures;
}
