package ng.com.bitsystems.mis.models.laboratories;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Queue extends BaseEntity {

     @CreationTimestamp
     private LocalDateTime requestTime;

     @Enumerated(EnumType.STRING)
     private QueueStatus queueStatus;
}