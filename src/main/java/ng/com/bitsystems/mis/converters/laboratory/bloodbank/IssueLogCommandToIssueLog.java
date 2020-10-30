package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.IssueLogCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Scientists;
import org.springframework.core.convert.converter.Converter;

public class IssueLogCommandToIssueLog implements Converter<IssueLogCommand, IssuanceLogs> {
    @Override
    public IssuanceLogs convert(IssueLogCommand source) {
        if(source==null){
            return null;
        }

        IssuanceLogs issuanceLogs=new IssuanceLogs();
        issuanceLogs.setId(source.getId());
        issuanceLogs.setIssueDate(source.getIssueDate());
        if(source.getPatientId()!=null){
            Patients patients=new Patients();
            patients.setId(source.getPatientId());
            issuanceLogs.setPatients(patients);
            Patients patients1= patients.addIssuedBlood(issuanceLogs);
        }

        if(source.getStorageId()!=null) {
            Storage storage = new Storage();
            storage.setId(source.getStorageId());
            issuanceLogs.setStorage(storage);
            Storage store = storage.addIssuanceLog(issuanceLogs);
        }

        if(source.getUserId() !=null){
            Scientists users=new Scientists();
            users.setId(source.getUserId());
            issuanceLogs.setUsers(users);
            Scientists scientists = users.addIssuedLog(issuanceLogs);
        }
        return issuanceLogs;
    }
}
