package ng.com.bitsystems.mis.models.admissions;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class CarePlanSubscriptions extends BaseService {

    @ManyToOne
    @JoinColumn(name = "carePlanId")
    private CarePlans carePlans;
}
