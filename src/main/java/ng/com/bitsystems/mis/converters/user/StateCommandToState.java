package ng.com.bitsystems.mis.converters.user;

import ng.com.bitsystems.mis.command.users.StateCommand;
import ng.com.bitsystems.mis.models.users.States;
import org.springframework.core.convert.converter.Converter;

public class StateCommandToState implements Converter<StateCommand, States> {
    @Override
    public States convert(StateCommand source) {
        return null;
    }
}
