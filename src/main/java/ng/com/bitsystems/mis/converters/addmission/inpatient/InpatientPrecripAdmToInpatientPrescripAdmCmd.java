package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionAdministration;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrecripAdmToInpatientPrescripAdmCmd implements Converter<InpatientPrescriptionAdministration, InpatientPrescriptionAdministration> {

    private InpatientPrescripToInpatientPrescripCmd inpatientPrescripCmdToInpatientPrescrip;

    public InpatientPrecripAdmToInpatientPrescripAdmCmd(InpatientPrescripToInpatientPrescripCmd inpatientPrescripCmdToInpatientPrescrip) {
        this.inpatientPrescripCmdToInpatientPrescrip = inpatientPrescripCmdToInpatientPrescrip;
    }

    @Override
    public InpatientPrescriptionAdministration convert(InpatientPrescriptionAdministration source) {


        if (source==null){
            return null;
        }
        InpatientPrescriptionAdministration inpatientPrescriptionAdministration=new InpatientPrescriptionAdministration();
        inpatientPrescriptionAdministration.setId(source.getId());
        inpatientPrescriptionAdministration
                .setInpatientPrescriptions(inpatientPrescripCmdToInpatientPrescrip
                        .convert(source.getInpatientPrescriptions()));
    }
}
