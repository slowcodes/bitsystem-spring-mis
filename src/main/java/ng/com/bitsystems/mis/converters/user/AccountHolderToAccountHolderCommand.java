package ng.com.bitsystems.mis.converters.user;

import ng.com.bitsystems.mis.command.users.AccountHolderCommand;
import ng.com.bitsystems.mis.models.users.AccountHolder;
import org.springframework.core.convert.converter.Converter;

public class AccountHolderToAccountHolderCommand implements
        Converter<AccountHolder, AccountHolderCommand> {
    @Override
    public AccountHolderCommand convert(AccountHolder source) {
        return null;
    }
}
