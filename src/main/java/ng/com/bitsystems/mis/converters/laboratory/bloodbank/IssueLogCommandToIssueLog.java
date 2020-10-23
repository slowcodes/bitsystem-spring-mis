package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.IssueLogCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;
import org.springframework.core.convert.converter.Converter;

public class IssueLogCommandToIssueLog implements Converter<IssueLogCommand, IssuanceLogs> {
    @Override
    public IssuanceLogs convert(IssueLogCommand source) {
        return null;
    }
}
