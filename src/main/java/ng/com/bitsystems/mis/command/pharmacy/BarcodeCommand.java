package ng.com.bitsystems.mis.command.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BarcodeCommand {
    private Long id;
    private String barcode;
    private Long pharmacyProductCommandId;
}
