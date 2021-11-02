package ng.com.bitsystems.mis.models.transactions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseTransaction extends BaseEntity {
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "users_id")
    private AppUsers appUsers;

    @Column(columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private LocalDate dateTransaction;

    @CreationTimestamp
    private LocalDateTime timeOfTransaction;

    @Column(name = "note")
    private String comment;

    private Integer discount;

}
