package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PackageCommand {
    private Long id;
    private String packageName;
    private Double discount;
    private String packageDesc;
}
