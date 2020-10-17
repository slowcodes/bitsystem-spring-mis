package ng.com.bitsystems.mis.command.vaccination;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;

@Setter
@Getter
@NoArgsConstructor
public class VaccineCommand {
    private Long id;
    private PharmacyProductCommand pharmacyProductCommand;
    private SalesPriceCodeCommand priceCodeCommand;
    private String description;
}

