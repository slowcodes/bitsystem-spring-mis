package ng.com.bitsystems.mis.converters.user;

import ng.com.bitsystems.mis.command.users.UserPrivilegeCommand;
import ng.com.bitsystems.mis.models.users.UsersPrivilege;
import org.springframework.core.convert.converter.Converter;

public class UserPrivilegeCommandToUserPrivilege implements Converter<UserPrivilegeCommand, UsersPrivilege> {
    @Override
    public UsersPrivilege convert(UserPrivilegeCommand source) {
        return null;
    }
}
