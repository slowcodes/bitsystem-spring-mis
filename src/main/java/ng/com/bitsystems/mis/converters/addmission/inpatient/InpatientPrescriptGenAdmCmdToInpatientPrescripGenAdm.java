package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionGeneratedAdministrationCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionGeneratedAdministration;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionSchedule;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescriptGenAdmCmdToInpatientPrescripGenAdm implements Converter<InpatientPrescriptionGeneratedAdministrationCommand, InpatientPrescriptionGeneratedAdministration> {

    private InpatientPrescripScheduleCmdToInpatientPrecripSchedule schedule;

    @Override
    public InpatientPrescriptionGeneratedAdministration convert(InpatientPrescriptionGeneratedAdministrationCommand source) {

        if(source==null){
            return null;
        }
        final InpatientPrescriptionGeneratedAdministration generatedAdministration = new InpatientPrescriptionGeneratedAdministration();

        generatedAdministration.setId(source.getId());
        generatedAdministration.setExtimatedAdminTime(source.getEstimatedAdminTime());
        if (source.getPrescriptionScheduleCommandId() != null){
            InpatientPrescriptionSchedule prescriptionSchedule = new InpatientPrescriptionSchedule();
            prescriptionSchedule.setId(source.getPrescriptionScheduleCommandId());
            generatedAdministration.setSchedule(prescriptionSchedule);
            prescriptionSchedule.addGeneratedAdmin(generatedAdministration);
        }

        return generatedAdministration;
    }
}
