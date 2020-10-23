package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.IssueLogCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;
import org.springframework.core.convert.converter.Converter;

public class IssueLogToIssueLogCommand implements Converter<IssuanceLogs, IssueLogCommand> {
    @Override
    public IssueLogCommand convert(IssuanceLogs source) {
        return null;
    }
}
