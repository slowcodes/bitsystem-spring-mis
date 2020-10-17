package ng.com.bitsystems.mis.command.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserPrivilegeCommand {
    private Long id;
    private Long userId;
    private String privileges;
}
