package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ExperimentParametersCommand {
    private Long id;
    private Long laboratoryInvestigationsId;
    private String parameter;
    private String valueDataType;
    private Double min;
    private Double max;
    private Integer presentation;
    private String unit;
//    private Long laboratoryTransactionDetailId;
}
