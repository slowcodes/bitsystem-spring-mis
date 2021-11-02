package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.IssueLogCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IssueLogToIssueLogCommand implements Converter<IssuanceLogs, IssueLogCommand> {
    @Override
    public IssueLogCommand convert(IssuanceLogs source) {
        if(source==null){
            return null;
        }

        final IssueLogCommand issueLogCommand=new IssueLogCommand();
        issueLogCommand.setId(source.getId());
        issueLogCommand.setIssueDate(source.getIssueDate());
        if(source.getPatients()!=null)
            issueLogCommand.setPatientId(source.getPatients().getId());

        if(source.getAppUsers()!=null)
            issueLogCommand.setUserId(source.getAppUsers().getId());

        if (source.getStorage()!=null)
            issueLogCommand.setStorageId(source.getStorage().getId());

        return issueLogCommand;
    }
}
