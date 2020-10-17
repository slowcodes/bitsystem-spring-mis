package ng.com.bitsystems.mis.command.accounts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.users.Users;

@Setter
@Getter
@NoArgsConstructor
public class OtherServiceCommand {
    private Long id;
    private Long expenseBooksId;
    private String description;
    private Long servicePriceCode;
    private Users createdBy;
}
