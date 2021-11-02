package ng.com.bitsystems.mis.converters.user;

import ng.com.bitsystems.mis.command.users.AccountHolderCommand;
import ng.com.bitsystems.mis.models.users.AccountHolder;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AccountHolderCommandToAccountHolder implements
        Converter<AccountHolderCommand, AccountHolder> {
    @Override
    public AccountHolder convert(AccountHolderCommand source) {
        return null;
    }
}
