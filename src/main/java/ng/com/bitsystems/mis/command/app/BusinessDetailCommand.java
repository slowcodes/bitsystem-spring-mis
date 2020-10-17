package ng.com.bitsystems.mis.command.app;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BusinessDetailCommand {
    private String name;
    private String address1;
    private String address2;
    private String email;
    private String phone1;
    private String phone2;
    private byte[] logoDir;
    private String email2;
}
