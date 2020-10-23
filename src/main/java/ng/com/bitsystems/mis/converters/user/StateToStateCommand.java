package ng.com.bitsystems.mis.converters.user;

import ng.com.bitsystems.mis.command.users.StateCommand;
import ng.com.bitsystems.mis.models.users.States;
import org.springframework.core.convert.converter.Converter;

public class StateToStateCommand implements Converter<States, StateCommand> {
    @Override
    public StateCommand convert(States source) {
        return null;
    }
}
