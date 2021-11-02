package ng.com.bitsystems.mis.services.laboratories;

import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.models.laboratories.Investigations;
import ng.com.bitsystems.mis.services.CrudService;

public interface LaboratoryInvestigationService extends CrudService<Investigations, Long> {
    Investigations add(LaboratoryInvestigationCommand object);
}
