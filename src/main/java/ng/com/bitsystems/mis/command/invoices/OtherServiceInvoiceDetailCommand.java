package ng.com.bitsystems.mis.command.invoices;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;

@Setter
@Getter
@NoArgsConstructor
public class OtherServiceInvoiceDetailCommand extends OtherServiceCommand {
    private Long id;
    private String status;
    private Long invoiceId;
}
