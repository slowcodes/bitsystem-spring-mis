package ng.com.bitsystems.mis.models.rewards.loyalties;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class PatientsLoyaltyGains  extends BaseEntity {


     private int id;
     private Patients patients;
     private PatientsLoyaltyActivites patientsLoyaltyActivites;
     private Integer redemption;
     private Date date;

    public PatientsLoyaltyGains() {
    }

	
    public PatientsLoyaltyGains(int id) {
        this.id = id;
    }
    public PatientsLoyaltyGains(int id, Patients patients, PatientsLoyaltyActivites patientsLoyaltyActivites, Integer redemption, Date date) {
       this.id = id;
       this.patients = patients;
       this.patientsLoyaltyActivites = patientsLoyaltyActivites;
       this.redemption = redemption;
       this.date = date;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Patients getPatients() {
        return this.patients;
    }
    
    public void setPatients(Patients patients) {
        this.patients = patients;
    }
    public PatientsLoyaltyActivites getPatientsLoyaltyActivites() {
        return this.patientsLoyaltyActivites;
    }
    
    public void setPatientsLoyaltyActivites(PatientsLoyaltyActivites patientsLoyaltyActivites) {
        this.patientsLoyaltyActivites = patientsLoyaltyActivites;
    }
    public Integer getRedemption() {
        return this.redemption;
    }
    
    public void setRedemption(Integer redemption) {
        this.redemption = redemption;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


