package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.IssueLogCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IssueLogCommandToIssueLog implements Converter<IssueLogCommand, IssuanceLogs> {
    @Override
    public IssuanceLogs convert(IssueLogCommand source) {
        if(source==null){
            return null;
        }

        IssuanceLogs issuanceLogs=new IssuanceLogs();
        issuanceLogs.setId(source.getId());
        issuanceLogs.setIssueDate(source.getIssueDate());


        if(source.getStorageId()!=null) {
            Storage storage = new Storage();
            storage.setId(source.getStorageId());
            issuanceLogs.setStorage(storage);
            Storage store = storage.addIssuanceLog(issuanceLogs);
        }

        if(source.getUserId() !=null){
            AppUsers users=new AppUsers();
            users.setId(source.getUserId());
            //issuanceLogs.setAppUsers(users);
            AppUsers scientists = users.addIssuedLog(issuanceLogs);
        }
        return issuanceLogs;
    }
}
