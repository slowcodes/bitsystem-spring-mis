package ng.com.bitsystems.mis.converters.user;

import ng.com.bitsystems.mis.command.users.UserCommand;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class UserCommandToUser implements Converter<UserCommand, Users> {
    @Override
    public Users convert(UserCommand source) {
        return null;
    }
}
