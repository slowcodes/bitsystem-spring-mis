package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class RadiologicalActivities  extends BaseEntity {

     private int groupId;
     private String title;
     private Integer priceCode;
     private String description;
     private int deptId;
     private String activityType;

}


