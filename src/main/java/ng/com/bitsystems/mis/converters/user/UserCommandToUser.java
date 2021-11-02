package ng.com.bitsystems.mis.converters.user;

import ng.com.bitsystems.mis.command.users.UserCommand;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserCommandToUser implements Converter<UserCommand, AppUsers> {
    @Override
    public AppUsers convert(UserCommand source) {
        return null;
    }
}
